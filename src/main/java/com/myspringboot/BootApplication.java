package com.myspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //构造类型注释
@EnableAutoConfiguration
public class BootApplication {

	@RequestMapping("/")
	public  String  home() {
		return "你好世界";
	}
	
	public  static  void  main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
	}
	
}
