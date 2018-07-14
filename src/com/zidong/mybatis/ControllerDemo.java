// package com.zidong.mybatis;
//
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.ResponseBody;
//
// import com.zidong.mybatis.dao.EmployeeMapper;
// import com.zidong.mybatis.pojo.Employee;
//
// @Controller
// public class ControllerDemo {
//
// @Autowired
// private EmployeeMapper mapper;
//
// @RequestMapping("/hello")
// @ResponseBody
// public String hello() {
// Employee employeeById = mapper.getEmployeeById(5);
// System.out.println(employeeById);
// return "hello";
// }
// }
