package com.myspringboot.xiangmu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import com.myspringboot.xiangmu.bean.User;

@Mapper
public interface UserMapper {

	@Select("select * from user where id=#{id} ")
	User findById(@Param("id") Long id);

	List<User> findAll();

	@Select("select *  from  user where name = #{name} and password = #{password}")
	List<User> findByNameAndPassword(@Param("name")String name, @Param("password")String password);

}
