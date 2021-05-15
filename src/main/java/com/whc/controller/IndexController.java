package com.whc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName: IndexController
 * @Author: whc
 * @Date: 2021/05/15/17:06
 */
@Controller
public class IndexController {

	@GetMapping("/index")
	public String toIndex() {
		return "ems/login";
	}

	@GetMapping("/toRegister")
	public String toRegister() {
		return "ems/regist";
	}

	@GetMapping("/toSave")
	public String toSave(){
		return "ems/addEmp";
	}
}
