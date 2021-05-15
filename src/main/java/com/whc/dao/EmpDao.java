package com.whc.dao;

import com.whc.entity.Emp;

import java.util.List;

/**
 * @ClassName: EmpDao
 * @Author: whc
 * @Date: 2021/05/15/18:24
 */
public interface EmpDao {
	List<Emp> findAll();

	void saveEmp(Emp emp);

	void delete(String id);

	Emp find(String id);

	void update(Emp emp);
}
