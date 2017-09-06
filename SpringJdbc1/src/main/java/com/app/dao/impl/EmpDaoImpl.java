package com.app.dao.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IEmpDao;

@Repository
public class EmpDaoImpl implements IEmpDao
{
	@Autowired
	private JdbcTemplate jt;
	
	public int updateEmp(int empId, Date date) {
		int i = jt.update("update emp set hire=? where empno=?",date,empId );
		return i;
	}
	
	public Map findEmpById(int empId) {
		Map m = jt.queryForMap("select * from emp where empno=?", empId);
		return m;
	}
	
	public List findAllEmp() {
		List list = jt.queryForList("select * from emp");
		return list;
	}

}
