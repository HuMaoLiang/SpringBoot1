package com.myspringboot.xiangmu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myspringboot.xiangmu.bean.User;
import com.myspringboot.xiangmu.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api("用户")
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
	
	@ApiOperation(value="查询所有的用户", notes="查询所有的用户" , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@CrossOrigin(origins = "*")
	@RequestMapping(value="/findByUserId", method = RequestMethod.POST)
	public User findUserById(@ApiParam(name="id",value="用户id",required=true) Long id) {
		System.err.println(id+"22");
		User user = userService.findById(id);
		System.err.println(111);
		System.out.println(user.toString());
		return user;
	}
	
}
