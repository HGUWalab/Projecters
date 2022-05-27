package com.walab.Projecters.Controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.walab.Projecters.Bean.Post;
import com.walab.Projecters.Bean.User;
import com.walab.Projecters.Bean.Tag;
import com.walab.Projecters.Service.BannerService;
import com.walab.Projecters.Service.BannerServiceImpl;
import com.walab.Projecters.Service.PostServiceImpl;
import com.walab.Projecters.Service.TagCountServiceImpl;
import com.walab.Projecters.Service.TagServiceImpl;

/*
* 프로젝트 만들기
* 내가 올린 글
* 내가 올린 글(수정페이지)
* 프로젝트 신청(프로젝트 글 보는 페이지)
* 를 담당하는 컨트롤러
* */
@Controller
@RequestMapping(value="/post")
public class PostController {

	@Autowired
	PostServiceImpl postService;
	@Autowired
	TagServiceImpl tagService;
	@Autowired
	TagCountServiceImpl tagCountService;
	@Autowired
	BannerServiceImpl bannerService;
	
	@RequestMapping(value = "/projectform", method = RequestMethod.GET)
	public String post() {
		System.out.println("==> post() in PostController: move to PostPage");
		return "ProjectForm";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addPost(HttpServletRequest request) {
		// Post Bean에 데이터 추가 후 DB에 올리는 방법
		Post post = new Post();
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("login");
		post.setWriter_id(user.getUser_id());//writer_id 받아오는
		post.setTitle(request.getParameter("title"));
		post.setContent(request.getParameter("content"));
		post.setPicture(request.getParameter("picture"));
		int post_id = postService.insertPost(post);
		bannerService.updateRecruitingTeam();
		
		System.out.println("==> addPost() in PostController: Saved data with post_id " + post_id + " Added Tag, too!");
		
		String tags[] = request.getParameter("tag").split(",");
		Tag tag = new Tag();
		tag.setPost_id(post_id);
		for (int i = 0; i < tags.length; i++) {
			tag.setTag_name(tags[i]);
			tagService.insertTag(tag);
		}
				
		return "redirect:/main/mainpage";
	}
}
