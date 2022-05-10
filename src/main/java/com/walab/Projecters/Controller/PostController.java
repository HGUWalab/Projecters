package com.walab.Projecters.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/*
* 프로젝트 만들기
* 내가 올린 글
* 내가 올린 글(수정페이지)
* 프로젝트 신청(프로젝트 글 보는 페이지)
* 를 담당하는 컨트롤러
* */
@Controller
@RequestMapping("/post")
public class PostController {
//	@RequestMapping(value = "/post", method = RequestMethod.GET)
//	public ModelAndView post(Model model) {
//		
//		ModelAndView mv = new ModelAndView();
//		System.out.println("post loaded");
//		// return ;
//	}
	
	@RequestMapping(value = "/projectform")
	public String projectform() {
		System.out.println("==> projectform() in PostController: move to ProjectForm page");
		return "ProjectForm";
	}
}
