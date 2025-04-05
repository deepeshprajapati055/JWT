package com.jwt.example.service;

import com.jwt.example.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

	private final List<User> store = new ArrayList<>();

	public UserService() {
		store.add(new User(UUID.randomUUID().toString(), "Deepesh Prajapati", "deepesh@dev.in"));
		store.add(new User(UUID.randomUUID().toString(), "Rahul Prajapati", "rahul@dev.in"));
		store.add(new User(UUID.randomUUID().toString(), "Jyoti Soni Prajapati", "jytisoniprjpti@dev.in"));
	}

	public List<User> getUsers(){
		return this.store;
	}
}
