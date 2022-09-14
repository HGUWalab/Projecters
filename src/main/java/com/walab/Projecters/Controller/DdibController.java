package com.walab.Projecters.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.walab.Projecters.Bean.Ddib;
import com.walab.Projecters.Bean.User;
import com.walab.Projecters.Service.DdibServiceImpl;


/*
* Ddib 담당하는 컨트롤러
* */
@RequestMapping("/ddib")
@Controller
public class DdibController {
	
	@Autowired
	DdibServiceImpl ddibService;
	
	@RequestMapping(value="/ddib/{post_id}", method=RequestMethod.GET)
	public int clickDdib(HttpServletRequest request, @PathVariable int post_id) {
		Ddib ddib = new Ddib();
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("login");
		
		ddib.setPost_id(post_id);
		ddib.setUser_id(user.getUser_id());
		
		System.out.println(ddibService.insertDdib(ddib));
		
		return 1;
	}
}
