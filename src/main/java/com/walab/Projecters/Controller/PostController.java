package com.walab.Projecters.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.walab.Projecters.Bean.Post;
import com.walab.Projecters.Bean.User;
import com.walab.Projecters.Bean.Tag;
import com.walab.Projecters.Bean.TagCount;
import com.walab.Projecters.Service.PostServiceImpl;
import com.walab.Projecters.Service.TagCountService;
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
	
	@RequestMapping(value = "/projectform", method = RequestMethod.GET)
	public String post() {
		System.out.println("==> post() in PostController: move to PostPage");
		return "ProjectForm";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addPost(HttpServletRequest request) {
//		Tag tag = new Tag();
//		TagCount tagcount = new TagCount();
		
		// Post Bean에 데이터 추가 후 DB에 올리는 방법
		Post post = new Post();
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("login");
		post.setWriter_id(user.getUser_id());//writer_id 받아오는
		post.setTitle(request.getParameter("title"));
		post.setContent(request.getParameter("content"));
		postService.insertPost(post);
		
		
//		String tagName = request.getParameter("tag_name"); // 어떤 형태로 받아올 것인가? 
//		String picture = request.getParameter("picture");
		
		//System.out.println(postTitle);
		//System.out.println(tagName);
		
//		// 태그 이름 parsing 
//		if(tagName != null) {
//			String[] taglist = tagName.split(",");
//			for(String t : taglist) {
//				tag.setTag_name(t);
//				//tagService
//			}
//			
//		}
		// post 객체 정보 초기화  
		//post.setWriter_id(Integer.parseInt(writerId)); 		
		// post 테이블에 title과 content 추가 
// 		int postId = postService.insertPost(post);
 		//postService.getPost(Integer.parseInt(writerId));
		
 		//post_id 받아와서 tag 테이블에 넣기 
 		// tag 테이블에 tag 추가 
// 		
// 		tag.setPost_id(postId);
// 		tagService.insertTag(tag);
 		
 		//tagcount 테이블에 tagcount 추가 
// 		int tCount = tagCountService.getTagcount(tagName);
// 		if(tCount > 0)
// 			tagCountService.updateTagcount(tagName);
// 		else
// 			tagCountService.insertTagcount(tagName);
 				
		System.out.println("==> addPost() in PostController: save data to DB");
		return "redirect:/main/mainpage";
	
	}

//	@RequestMapping(value = "/post", method = RequestMethod.GET)
//	public ModelAndView post(Model model) {
//		
//		ModelAndView mv = new ModelAndView();
//		System.out.println("post loaded");
//		// return ;
//	}
		
}
