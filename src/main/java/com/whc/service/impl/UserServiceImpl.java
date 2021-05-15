package com.whc.service.impl;

import com.whc.dao.UserDao;
import com.whc.entity.User;
import com.whc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

/**
 * @ClassName: UserServiceImpl
 * @Author: whc
 * @Date: 2021/05/15/17:45
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public void register(User user) {
		user.setId(UUID.randomUUID().toString());
		userDao.register(user);
	}

	@Override
	public User login(String username, String password) {
		return userDao.login(username, password);
	}
}
