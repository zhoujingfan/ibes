package com.buptsse.ibes.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor {

	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated met	hod stub

	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		// TODO Auto-generated method stub
		//拦截器，当用户没有登录的时候，需要用户登录
		HttpSession session = request.getSession();
		String userName = (String) session.getAttribute("username");
		if(userName!=null&& !"".equals(userName)){
			//用户已经登录，放行
			return true;
		}
		
		//用户没有登录
		String requestURI = request.getRequestURI();
		if(requestURI.contains("login") || requestURI.contains("loginU")){
			return true;
		}
		//跳转到登录界面
		request.getRequestDispatcher("index.jsp").forward(request, response);
		return false;
	}

}
