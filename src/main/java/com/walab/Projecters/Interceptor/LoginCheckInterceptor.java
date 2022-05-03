package com.walab.Projecters.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginCheckInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("preHandle() in LoginCheckInterceptor works!");
		HttpSession session = request.getSession(); //session을 가져온다.
		Object obj = session.getAttribute("login"); //session에 있는 'login' attribute를 가져와서 객체로 저장한다.
		if(obj == null) {
			response.sendRedirect(request.getContextPath() + "/login/loginpage");//obj가 없을 경우 다시 로그인페이지로 돌아가고 false를 반환한다.
			return false;
		}
		return true; //obj가 있을 경우 true를 반환한다.
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		super.afterCompletion(request, response, handler, ex);
	}
	
}
