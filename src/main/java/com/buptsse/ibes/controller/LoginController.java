package com.buptsse.ibes.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.buptsse.ibes.model.User;
import com.buptsse.ibes.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	UserService userService;
	@RequestMapping("/login")
	public void Login(){
		System.out.println("hello world11");
	}
	
	/**
	 * 个人用户登录
	 * @param username
	 * @param password
	 * @param session
	 * @return
	 */
	@RequestMapping("/loginSubmit")
	public String LoginSubmit(String username, String password, HttpSession session){
		User user = userService.getByUsername(username);
		if(user.getPassword().equals(password)){
			session.setAttribute("usernmae", username);
			return "success";
		}else
			return "login";
	}
	
}
