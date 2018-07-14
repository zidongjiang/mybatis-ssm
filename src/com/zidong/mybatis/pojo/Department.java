package com.zidong.mybatis.pojo;

import java.util.List;

public class Department {

	private Integer id;

	private String departemtName;

	private List<Employee> emps;

	public String getDepartemtName() {
		return departemtName;
	}

	public List<Employee> getEmps() {
		return emps;
	}

	public Integer getId() {
		return id;
	}

	public void setDepartemtName(String departemtName) {
		this.departemtName = departemtName;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", departemtName=" + departemtName + "]";
	}
}
