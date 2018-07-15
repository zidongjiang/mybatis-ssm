package com.zidong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zidong.mybatis.pojo.Employee;
import com.zidong.mybatis.service.Service;

@RestController
public class HelloController {

	@Autowired
	private Service service;

	@RequestMapping("/hello")
	public String hello() {

		return "hello";
	}

	@RequestMapping("/testCache")
	public String testCache() {
		Employee employeeMapper = service.getEmployeeMapper(8);
		Employee employeeMapper1 = service.getEmployeeMapper(9);
		Employee employeeMapper2 = service.getEmployeeMapper(10);
		System.out.println(employeeMapper);
		// service.putEmployeeMapper(8);
		// service.evictEmployeeMapper(8);

		return "hello";
	}


	public void test(){
		System.out.print("你好");
	}
}
