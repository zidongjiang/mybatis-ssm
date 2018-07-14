package com.zidong.mybatis.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Component;

import com.zidong.mybatis.dao.EmployeeMapper;
import com.zidong.mybatis.pojo.Employee;

@Component
public class Service {

	private Logger logger = Logger.getLogger(Service.class);

	@Autowired
	private EmployeeMapper mapper;

	@Caching(cacheable = { @Cacheable(value = "", key = "") })
	public void cache() {

	}

	@CacheEvict(value = "myCache", key = "'employee.'+#p0")
	public void evictEmployeeMapper(int id) {
		// logger.info("调用@CacheEvict缓存方法");
		System.out.println("调用@CacheEvict缓存方法");
	}

	@Cacheable(value = "myCache", key = "'employee.'+#p0")
	public Employee getEmployeeMapper(int id) {
		// logger.info("调用@Cacheable缓存方法");
		System.out.println("调用@Cacheable缓存方法");
		return mapper.getEmployeeById(id);
	}

	@CachePut(value = "myCache", key = "'employee.'+#p0")
	public Employee putEmployeeMapper(int id) {
		// logger.info("调用@CachePut缓存方法");
		System.out.println("调用@CachePut缓存方法");
		return mapper.getEmployeeById(id);
	}
}
