package com.walab.Projecters.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.walab.Projecters.Bean.Post;
import com.walab.Projecters.Bean.User;
import com.walab.Projecters.Service.UserServiceImpl;


/*
* 마이페이지 - 나의프로필, 내가 올린 글, 찜한 프로젝트, 신청한 프로젝트, 모집 마감 팝업
* 담당하는 컨트롤러
* */
@Controller
@RequestMapping("/mypage")
public class MyPageController {
	
	@Autowired
	UserServiceImpl userService;
	
	@RequestMapping(value = "/mypage1", method = RequestMethod.GET)
	public String mypage1(HttpServletRequest request) {
		return "Mypage1";
	}
	
	@RequestMapping(value = "/mypage2", method = RequestMethod.GET)
	public ModelAndView mypage2(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("login");
		
		List<Post> listPosts = userService.getApplies(user.getUser_id());
		mv.addObject("listPost", listPosts);
		mv.setViewName("Mypage2");
		
		return mv;
	}
	
	@RequestMapping(value = "/mypage3", method = RequestMethod.GET)
	public String mypage3() {
		return "Mypage3";
	}
}
