package com.whc.dao;

import com.whc.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName: UserDao
 * @Author: whc
 * @Date: 2021/05/15/17:41
 */
public interface UserDao {
	void register(User user);

	User login(@Param("username") String username, @Param("password") String password);
}
