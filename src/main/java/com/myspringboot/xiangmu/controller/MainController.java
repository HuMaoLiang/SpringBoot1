package com.myspringboot.xiangmu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.myspringboot.xiangmu.bean.User;
import com.myspringboot.xiangmu.service.UserService;

@Controller
public class MainController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/spring")
	public  String  home() {
		return "index";
	}
	
	@RequestMapping("/login")
	public  ModelAndView  login(HttpServletRequest request, ModelAndView mav) {
		String name = request.getParameter("name"); 
		String password = request.getParameter("password"); 
		User user = userService.findByNameAndPassword(name, password);
		if(user == null) {
			mav.addObject("msg", "账号密码错误");
			mav.setViewName("index");
		}else {
			mav.setViewName("login");
		}
		mav.addObject("user", user);
		return mav;
	}
}
