package com.sapient.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sapient.exceptions.IdException;
import com.sapient.exceptions.NotfoundException;
import com.sapient.vo.Emp;

public class EmpMemDao implements IDao {
	public static Map<Integer, Emp> emap;
	static {
		emap = new HashMap<Integer, Emp>();
		emap.put(1001, new Emp(1001, "Ram", 45000, 1, LocalDate.of(2014, 7, 21)));
		emap.put(1005, new Emp(1005, "Tom", 55000, 1, LocalDate.of(2015, 9, 17)));
		emap.put(1003, new Emp(1003, "Sam", 35000, 1, LocalDate.of(2013, 7, 13)));
	}

	@Override
	public List<Emp> viewEmployee() {
		List<Emp> lst = new ArrayList<Emp>();
		lst.addAll(emap.values());
		return lst; // return a collection always when get a collection
	}

	@Override
	public Emp viewEmployee(int eid) throws NotfoundException {
		System.out.println(emap.containsKey(eid));
		if (!emap.containsKey(eid))
			throw new NotfoundException("Employee not fsound");
		Emp emp = emap.get(eid);
		return emp;
	}

	@Override
	public int addEmployee(Emp emp) throws IdException {
		if (emap.containsKey(emp.getEmpId()))
			throw new IdException("Id already exist");
		emap.put(emp.getEmpId(), emp);
		return 0;
	}

	@Override
	public int removeEmployee(int eid) throws NotfoundException {
		if (!emap.containsKey(eid))
			throw new NotfoundException("Employee not fsound");
		emap.remove(eid);
		return 0;
	}

	@Override
	public int updateSalary(int eid, double sal) throws NotfoundException {
		System.out.println(emap.containsKey(eid));
		if (!emap.containsKey(eid))
			throw new NotfoundException("Employee not fsound");
		Emp emp = emap.get(eid);
			emp.setSal(sal);
		return 0;
	}
}
