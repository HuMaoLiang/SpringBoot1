package com.myspringboot.xiangmu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myspringboot.xiangmu.bean.User;
import com.myspringboot.xiangmu.mapper.UserMapper;
import com.myspringboot.xiangmu.service.UserService;

@Service("UserService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserMapper usermapper;
	
	@Override
	public List<User> findAll() {
		return usermapper.findAll();
	}

	@Override
	public User findById(Long id) {
		return usermapper.findById(id);
	}

}
