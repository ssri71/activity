package com.sapient.dao;

import java.util.List;

import com.sapient.exceptions.IdException;
import com.sapient.exceptions.NotfoundException;
import com.sapient.vo.Emp;

public interface IDao {
	List<Emp> viewEmployee();

	Emp viewEmployee(int eid) throws NotfoundException;

	int addEmployee(Emp emp) throws IdException;

	int removeEmployee(int eid) throws NotfoundException;

	int updateSalary(int eid, double sal) throws NotfoundException;
}
