package com.walab.Projecters.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/*
* 프로젝트 신청폼
* 다루는 컨트롤러
* */
@RequestMapping("/form")
@Controller
public class FormController {
	
	@RequestMapping(value="/postform/{post_id}", method=RequestMethod.GET)
	public String applyPost(@PathVariable int post_id, Model model) {
		System.out.println("==> applyPost() in FormController: open page with post id = " + post_id);
		model.addAttribute("post_id", post_id);
		return "ProjectForm";
	}
}
