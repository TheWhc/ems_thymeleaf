package com.whc.service;

import com.whc.entity.Emp;
import com.whc.entity.User;

import java.util.List;

public interface EmpService {
	List<Emp> findAll();

	void save(Emp emp);

	void delete(String id);

	Emp find(String id);

	void update(Emp emp);
}
