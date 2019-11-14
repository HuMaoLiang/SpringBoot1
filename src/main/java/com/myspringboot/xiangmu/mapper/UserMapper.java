package com.myspringboot.xiangmu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.myspringboot.xiangmu.bean.User;

@Mapper
public interface UserMapper {

	User findById(@Param("id") Long id);

	List<User> findAll();

}
