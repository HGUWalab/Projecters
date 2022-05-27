package com.walab.Projecters.Controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.walab.Projecters.Bean.Form;
import com.walab.Projecters.Bean.User;
import com.walab.Projecters.Service.FormServiceImpl;


/*
* 프로젝트 신청폼
* 다루는 컨트롤러
* */
@RequestMapping("/form")
@Controller
public class FormController {
	
	@Autowired
	FormServiceImpl formService;
	
	@RequestMapping(value="/postform/{post_id}", method=RequestMethod.GET)
	public ModelAndView apply(@PathVariable int post_id) {
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("post_id", post_id);
		mv.setViewName("ApplyProject");
		
		System.out.println("==> apply() in FormController: open page with post id = " + post_id);
		
		return mv;
	}
	
	@RequestMapping(value="/apply", method=RequestMethod.GET)
	public String applyForm(HttpServletRequest request) {
		Form form = new Form();
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("login");
		form.setWriter_id(user.getUser_id());
		form.setContact(request.getParameter("contact"));
		form.setContent(request.getParameter("content"));
		form.setPost_id(Integer.parseInt(request.getParameter("post_id")));
		form.setStatus(0); //0:대기중, 1:수락, 2:거절
		
		formService.insertForm(form);
		
		System.out.println("==> apply() in FormController: applied to the project successfully");
		
		return "redirect:/main/mainpage";
	}
}
