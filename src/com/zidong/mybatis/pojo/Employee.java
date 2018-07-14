package com.zidong.mybatis.pojo;

import java.io.Serializable;

public class Employee implements Serializable {

	/** serialVersionUID */
	private static final long serialVersionUID = -6243831654434085974L;

	private Integer id;

	private String lastName;

	private String email;

	private String gender;

	private Department dept;

	public Department getDept() {
		return dept;
	}

	public String getEmail() {
		return email;
	}

	public String getGender() {
		return gender;
	}

	public Integer getId() {
		return id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", lastName=" + lastName + ", email=" + email + ", gender=" + gender;
	}

}
