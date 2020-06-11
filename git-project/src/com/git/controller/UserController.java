package com.git.controller;

import com.git.model.User;
import com.git.service.UserService;

public class UserController {

	public UserService service = new UserService ();
	
	public void addUser (User user) {
		service.createUser(user);
	}
}
