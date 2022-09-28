package com.walab.Projecters.Controller;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

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
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addPost(HttpServletRequest request) {
		System.out.println("여긴 왔네");
		
		Post post = new Post();
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("login");

		
		post.setWriter_id(user.getUser_id());//writer_id 받아오는
		post.setTitle(request.getParameter("title"));
		post.setContent(request.getParameter("content"));
		post.setPicture(request.getParameter("picture"));
		System.out.println("이미지 주소: " + request.getParameter("picture"));
		

		int post_id = postService.insertPost(post);
		
		bannerService.updateRecruitingTeam();
				
		String tags = request.getParameter("tag");
		String tagsArr[] = request.getParameter("tag").split(",");
		
		Tag tag = new Tag();
		int result; 
		tag.setPost_id(post_id);
		
		tag.setTag_name(tags);
		tagService.insertTag(tag);
		for(int i=0; i<tagsArr.length; i++) {
			result = tagCountService.checkTag(tagsArr[i]);
//			System.out.println(result);
			// 만약 데이터베이스 내에 존재하면 해당 컬럼 값 + 1  
			if(result == 1) {
				// 해당 컬럼의 값 +1 해주는 쿼리 호출
				System.out.println("기존에 있던 태그 ");
				tagCountService.updateTagcount(tagsArr[i]);
			}
			if(result == 0)
				// 데이터베이스에 값 추가 
				tagCountService.insertTagcount(tagsArr[i]);
		}	
		System.out.println("==> addPost() in PostController: Saved data with post_id " + post_id + " Added Tag, too!");
		ModelAndView mv = new ModelAndView();
		
		String pTitle = post.getTitle();
		System.out.println(post.getTitle());
	
		mv.addObject("pTitle", pTitle);
		mv.addObject("post", post);
	
		
		mv.setViewName("Project");
		
		return mv;
	}
	/*나중에 게시글 직접적으로 눌렀을때 이동하는 용도*/
	@RequestMapping(value = "/project/{post_id}", method = RequestMethod.GET)
	public ModelAndView viewPost(HttpServletRequest request, @PathVariable int post_id) {
		ModelAndView mv = new ModelAndView();
		
		Post post = postService.getPost(post_id);
		mv.addObject("post", post);
		mv.setViewName("Project");
		System.out.println("==>viewPost() in PostController: load data of the post and move to the page");
		return mv;
	}


//	private String saveFile(MultipartFile upfile, HttpSession session) {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
