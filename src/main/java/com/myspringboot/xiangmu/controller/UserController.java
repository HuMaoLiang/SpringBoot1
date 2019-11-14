package com.myspringboot.xiangmu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myspringboot.xiangmu.bean.User;
import com.myspringboot.xiangmu.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService  userService;
	
	@RequestMapping("/findAll")
	public List<User> findAll() {
		List<User> list = userService.findAll();
		return list;
	}
	
	@RequestMapping("/findUserById")
	public User findUserById(Long id) {
		User user = userService.findById(id);
		return user;
	}
	
}
