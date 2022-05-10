package com.walab.Projecters.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/*
* 마이페이지 - 나의프로필, 내가 올린 글, 찜한 프로젝트, 신청한 프로젝트, 모집 마감 팝업
* 담당하는 컨트롤러
* */
@Controller
@RequestMapping("/mypage")
public class MyPageController {
	
	@RequestMapping(value = "/mypage1", method = RequestMethod.GET)
	public String mypage1() {
		return "Mypage1";
	}
	
	@RequestMapping(value = "/mypage2", method = RequestMethod.GET)
	public String mypage2() {
		return "Mypage2";
	}
	
	@RequestMapping(value = "/mypage3", method = RequestMethod.GET)
	public String mypage3() {
		return "Mypage3";
	}
}
