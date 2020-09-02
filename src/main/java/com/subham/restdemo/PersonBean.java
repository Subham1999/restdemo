package com.subham.restdemo;

import javax.ws.rs.QueryParam;

public class PersonBean {
	private @QueryParam("name") String name;
	private @QueryParam("address") String address;
	private @QueryParam("age") int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
