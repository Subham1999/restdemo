package com.subham.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {
	private String name;
	private String address;
	private int age;
	private int id;
	
	public Person() {}

	public Person(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	@Override
	public String toString() {
		return "[" + name + ", " + age + ", " + address + "]";
	}
	
	public static class Builder{
		private String name;
		private String address;
		private int age;	
		public Builder() {}
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		public Builder address(String address) {
			this.address = address;
			return this;
		}
		public Builder age(int age) {
			this.age= age;
			return this;
		}
		public Person build() {
			return new Person(name, address, age);
		}
	}
}
