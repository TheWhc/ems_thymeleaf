package com.whc.service;

import com.whc.entity.User;

/**
 * @ClassName: UserService
 * @Author: whc
 * @Date: 2021/05/15/17:44
 */
public interface UserService {
	void register(User user);
	User login(String username, String password);
}
