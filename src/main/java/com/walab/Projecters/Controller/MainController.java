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
import com.walab.Projecters.Service.TagCountService;
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
	TagCountService tagCountService;
	
	@Autowired
	BannerService bannerService; 
	
	
	@RequestMapping(value = "/mainpage", method = RequestMethod.GET)
	public ModelAndView main(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		System.out.println("Main page loaded");
		List<Post> list;
		List<String> top10tags;
		//List<Tag> list2;
		
		list = postService.getAllPost();
		System.out.println(list);
		
		int recruiting = bannerService.getRecruitingTeam();
		int formCount = bannerService.getFormCount();
		int postCount = postService.getPostCount();
		top10tags =  tagCountService.getTopTen();
		//list2 = tagService.getTagList();
		
		System.out.println("Top 10 tags");
		for(int i=0; i<top10tags.size(); i++)
			System.out.println(top10tags);
		
		mv.addObject("top10tags", top10tags);
		//mv.addObject("list2", list2);
		mv.addObject("formCount", formCount);
		mv.addObject("postList", list);
		mv.addObject("postCount", postCount);
		mv.setViewName("Main");
		return mv;
	}
	
	@RequestMapping(value = "/project", method = RequestMethod.GET)
	public String project() {		
		return "Project";
	}
}
