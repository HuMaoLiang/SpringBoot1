package com.myspringboot.xiangmu.service;

import java.util.List;

import com.myspringboot.xiangmu.bean.User;

public interface UserService {

	List<User> findAll();

	User findById(Long id);

	User findByNameAndPassword(String name, String password);

}
