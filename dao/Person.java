package com.fatou.demoJpa14.dao;

import java.util.Date;

public class Person {
	
	private int id;
	private String name;
	private String location;
	private Date birthday;
	
	public Person() {
		super();
	}

	public Person(int id, String name, String location, Date birthday) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.birthday = birthday;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", location=" + location + ", birthday=" + birthday + "]";
	}
	
	
	
	
	
	

}
