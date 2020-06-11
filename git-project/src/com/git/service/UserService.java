package com.git.service;

import com.git.dao.UserDao;
import com.git.model.User;

public class UserService {

	public UserDao dao = new UserDao();
	public void createUser (User user) {
		dao.add(user);
	}
}
