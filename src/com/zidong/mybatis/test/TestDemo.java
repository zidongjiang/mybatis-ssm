package com.zidong.mybatis.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zidong.mybatis.dao.EmployeeMapper;
import com.zidong.mybatis.pojo.Employee;

public class TestDemo {

	@Test
	public void test() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:app-*.xml");

		EmployeeMapper mapper = context.getBean(EmployeeMapper.class);

		Employee employeeById = mapper.getEmployeeById(5);

		System.out.println(employeeById);
	}

	@Test
	public void test1() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:app-*.xml");

		SqlSession sqlSession = context.getBean(SqlSession.class);
		EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

		Employee employeeById = mapper.getEmployeeById(5);

		System.out.println(employeeById);
	}
}
