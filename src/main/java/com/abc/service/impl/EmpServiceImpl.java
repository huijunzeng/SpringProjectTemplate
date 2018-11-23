package com.abc.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.abc.dao.EmpDao;
import com.abc.entity.Emp;
import com.abc.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {

	@Resource
	private EmpDao empDao;
	
	public void save(Emp emp) {
		empDao.save(emp);
	}

}
