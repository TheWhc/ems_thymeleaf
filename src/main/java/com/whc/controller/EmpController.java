package com.whc.controller;

import com.whc.entity.Emp;
import com.whc.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ClassName: EmpController
 * @Author: whc
 * @Date: 2021/05/15/18:32
 */
@Controller
@RequestMapping("/emp")
public class EmpController {
	@Autowired
	private EmpService empService;

	// 更新员工信息方法
	@PostMapping("/update")
	public String update(Emp emp) {
		empService.update(emp);
		return "redirect:/emp/findAll";
	}

	// id查询员工
	@GetMapping("/find")
	public String find(String id, Model model) {
		Emp emp = empService.find(id);
		model.addAttribute("emp", emp);
		return "/ems/updateEmp";
	}

	// 删除员工
	@RequestMapping("/delete")
	public String delete(String id) {
		empService.delete(id);
		return "redirect:/emp/findAll";
	}

	// 保存用户信息
	@PostMapping("/save")
	public String save(Emp emp) {
		empService.save(emp);
		return "redirect:/emp/findAll";
	}

	// 查找所有员工
	@GetMapping("/findAll")
	public String findAll(Model model) {
		List<Emp> emps = empService.findAll();
		model.addAttribute("emps", emps);
		return "ems/emplist";
	}

}
