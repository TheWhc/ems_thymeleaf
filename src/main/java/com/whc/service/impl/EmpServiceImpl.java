package com.whc.service.impl;

import com.whc.dao.EmpDao;
import com.whc.entity.Emp;
import com.whc.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpDao empDao;

	@Override
	// 如果存在一个事务，支持当前事务。如果没有事务，则非事务的执行
	@Transactional(propagation = Propagation.SUPPORTS)
	public List<Emp> findAll() {
		return empDao.findAll();
	}

	@Override
	public void save(Emp emp) {
		emp.setId(UUID.randomUUID().toString());
		empDao.saveEmp(emp);
	}

	@Override
	public void delete(String id) {
		empDao.delete(id);
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public Emp find(String id) {
		return empDao.find(id);
	}

	@Override
	public void update(Emp emp) {
		empDao.update(emp);
	}

}
