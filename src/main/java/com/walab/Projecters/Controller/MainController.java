package com.walab.Projecters.Controller;

import java.util.Iterator;
import java.util.List;

import javax.print.PrintService;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.walab.Projecters.Bean.Post;
import com.walab.Projecters.Bean.Tag;
import com.walab.Projecters.Service.BannerService;
import com.walab.Projecters.Service.PostService;
import com.walab.Projecters.Service.TagService;

/*
* 메인페이지 담당하는 컨트롤러
* */
@Controller
@RequestMapping("/main")
public class MainController {
	@Autowired 
	PostService postService;
	
	@Autowired
	TagService tagService;
	
	@Autowired
	BannerService bannerService; 
	
	@RequestMapping(value = "/mainpage", method = RequestMethod.GET)
	public ModelAndView main(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		System.out.println("Main page loaded");
		List<Post> list;
		
		list = postService.getAllPost();
		
		int recruiting = bannerService.getRecruitingTeam();
		int postCount = postService.getPostCount();
		
		mv.addObject("postCount", postCount);
		mv.addObject("postList", list);
		mv.addObject("recruiting", recruiting);
		mv.setViewName("Main");
		return mv;
	}
	
	@RequestMapping(value = "/project", method = RequestMethod.GET)
	public String project() {		
		return "Project";
	}
}
