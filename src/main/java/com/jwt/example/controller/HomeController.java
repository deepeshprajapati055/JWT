package com.jwt.example.controller;

import com.jwt.example.models.User;
import com.jwt.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private UserService userService;

	@GetMapping("/user")
	public List<User> getAllUsers(){
		return this.userService.getUsers();
	}

	@GetMapping("/get-user-information")
	public String getCurrentUser(Principal principal){
		return principal.getName();
	}

}