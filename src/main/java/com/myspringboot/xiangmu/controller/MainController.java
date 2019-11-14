package com.myspringboot.xiangmu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping("/")
	public  String  home() {
		return "你好世界2";
	}
}
