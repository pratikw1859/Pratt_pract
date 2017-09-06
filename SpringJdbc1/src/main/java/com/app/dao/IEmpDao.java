package com.app.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface IEmpDao 
{
	public int updateEmp(int empId, Date date);
	public Map findEmpById(int empId);
	public List findAllEmp();
}
