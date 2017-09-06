package com.app.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IEmpDao;

@Service
public class TestBean 
{
	@Autowired
	private IEmpDao dao;
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	String s = "2017-09-06";
	
	
	public void m1() throws ParseException
	{
		java.util.Date date = sdf.parse(s);
		int i = dao.updateEmp(104, date);
		System.out.println(i+" Row Updated Successfully");
	}
	
	public void m2()
	{
		Map m = dao.findEmpById(102);
		System.out.println(m);
	}
	
	public void m3()
	{
		List list =dao.findAllEmp();
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			Map m = (Map)itr.next();
			System.out.println(m);
		}
	}
}
