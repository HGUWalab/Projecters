package com.walab.Projecters.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
* 메인페이지 담당하는 컨트롤러
* */
@Controller
@RequestMapping("/main")
public class MainController {

	@RequestMapping(value = "/mainpage", method = RequestMethod.GET)
	public String main() {		
		return "Main";
	}
	
	@RequestMapping(value = "/project", method = RequestMethod.GET)
	public String project() {		
		return "Project";
	}
}
