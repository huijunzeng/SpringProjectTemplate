package com.abc.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.service.EmpService;

@RestController
public class IndexController {
	
	@Resource
	private EmpService empServiceImpl;
	
	@RequestMapping("/index")
	public String index() {
		return "success";
	}
	
}
