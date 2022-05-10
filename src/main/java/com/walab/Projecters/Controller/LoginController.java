package com.walab.Projecters.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.walab.Projecters.Bean.User;
import com.walab.Projecters.Service.UserServiceImpl;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	UserServiceImpl service;
	
	@RequestMapping(value = "/loginpage", method = RequestMethod.GET)
	public String loginpage() {
		System.out.println("==> loginpage() in LoginController: move to loginpage");
		return "Login";
	}
	
//	@RequestMapping(value = "/loginCheck", method = RequestMethod.POST)
//	public String loginCheck(@RequestParam("email") String email, HttpSession session) {
//		System.out.println("==> loginCheck() in LoginController works");
//		User vo = new User();
//		vo.setEmail(email);
//		
//		if(session.getAttribute("login") != null) {
//			session.removeAttribute("login");
//		}
//		
//		//UserServiceImpl에서 DB에 들어가서 사용자 정보가 있는지 확인하고 있을경우 객체를 return해준다.
//		User loginvo = service.getUser(vo); 
//		if(loginvo != null) {
//			System.out.println("로그인 성공!");
//		}else {
//			System.out.println("DB에 새롭게 넣고 로그인 성공!");
//			service.insertUser(vo);
//		}
//		 //session에 loginvo객체 집어넣고 저장하는 것이다.	
//		session.setAttribute("login", loginvo);
//		return "redirect:/";
//	}
	
	@RequestMapping(value = "/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		System.out.println("==> logout() in LoginController: logout and move to mainpage");
		return "redirect:/main/mainpage";
	}
}
