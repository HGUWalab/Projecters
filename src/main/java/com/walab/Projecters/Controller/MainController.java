package com.walab.Projecters.Controller;

import java.util.Iterator;
import java.util.List;

import javax.print.PrintService;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.walab.Projecters.Bean.Post;
import com.walab.Projecters.Bean.Tag;
import com.walab.Projecters.Service.BannerService;
import com.walab.Projecters.Service.BannerServiceImpl;
import com.walab.Projecters.Service.PostService;
import com.walab.Projecters.Service.PostServiceImpl;
import com.walab.Projecters.Service.TagCountService;
import com.walab.Projecters.Service.TagCountServiceImpl;
import com.walab.Projecters.Service.TagService;
import com.walab.Projecters.Service.TagServiceImpl;

/*
* 메인페이지 담당하는 컨트롤러
* */
@Controller
@RequestMapping("/main")
public class MainController {
	@Autowired 
	PostServiceImpl postService;
	
	@Autowired
	TagServiceImpl tagService;
	
	@Autowired
	TagCountServiceImpl tagCountService;
	
	@Autowired
	BannerServiceImpl bannerService; 
	
	
	@RequestMapping(value = "/mainpage", method = RequestMethod.GET)
	public ModelAndView main(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		System.out.println("Main page loaded");
		List<Post> list;
		List<String> top10tags;
		
		
		list = postService.getAllPost();

		
		int recruiting = bannerService.getRecruitingTeam();
		int formCount = bannerService.getFormCount();
		int postCount = postService.getPostCount();
		top10tags =  tagCountService.getTopTen();
		
		
		mv.addObject("top10tags", top10tags);
		
		mv.addObject("formCount", formCount);
		mv.addObject("postList", list);
		mv.addObject("postCount", postCount);
		mv.setViewName("Main");
		return mv;
		
		
	}
	
	@RequestMapping(value = "/mainpage/{search}", method = RequestMethod.GET)
	public ModelAndView viewSearch(HttpServletRequest request, @PathVariable("search") String search) {
		ModelAndView mv = new ModelAndView();
		System.out.println("==> viewSearch() in MainController: SearchText = " + search);
		List<Post> list;
		List<String> top10tags;
		int recruiting = bannerService.getRecruitingTeam();
		int formCount = bannerService.getFormCount();
		int postCount = postService.getPostCount();
		top10tags =  tagCountService.getTopTen();
		list = postService.searchPosts(search);
		System.out.println("Searched List = " + list);
		
		mv.addObject("top10tags", top10tags);
		mv.addObject("formCount", formCount);
		mv.addObject("postList", list);
		mv.addObject("postCount", postCount);
		mv.setViewName("Main");
	
		return mv;	
	}
	
	@RequestMapping(value = "/project/{post_id}", method = RequestMethod.GET)
	public ModelAndView project(HttpServletRequest request, @PathVariable("post_id") int post_id) {		
		ModelAndView mv = new ModelAndView();
		System.out.println("==>project() in MainController: post_id = " + post_id);
		Post post;
		Tag tag;
		
		post = postService.getClickedPost(post_id);
		tag = tagService.getTag(post_id);
		System.out.println(post.getTitle() + tag.getTag_name());
		
		mv.addObject("post", post);
		mv.addObject("tag", tag);
		mv.setViewName("Project");
		
		
		return mv;
	}
}
