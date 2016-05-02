package com.estsoft.spring_container;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Guest {
	private String name;
	private List<User> users;
	
	@Autowired
	private Friend friend;
	
	public Guest() {
		this.name = "영심이";
	}

	@Override
	public String toString() {
		return "Guest [name=" + name + ", users=" + users + ", friend=" + friend + "]";
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
}