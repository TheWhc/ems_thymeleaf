package com.whc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: User
 * @Author: whc
 * @Date: 2021/05/15/17:40
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	private String id;
	private String username;
	private String realname;
	private String password;
	private String sex;
}
