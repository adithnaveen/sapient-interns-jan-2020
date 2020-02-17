package com.naveen.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.naveen.beans.Employee;
import com.naveen.connection.GetConnection;
import com.naveen.interfaces.IEmployeeDAO;

public class EmployeeDAO implements IEmployeeDAO {

	// -1 - for iterator
	// 0 - for Array
	// 1 - for Positional Parameters

	@Override
	public boolean insertEmployee(Employee employee) {

		String sql = "insert into emp values (?,?,?,?,?)";
		// you will have access to all ps + rs and always
		// there will be 1 connection object because it is
		// static
		GetConnection gc = new GetConnection();
		try {
			gc.ps = GetConnection.getPostGresConnection().prepareStatement(sql);

			gc.ps.setInt(1, employee.getEmpId());
			gc.ps.setString(2, employee.getEmpName());
			gc.ps.setDouble(3, employee.getEmpSal());
			gc.ps.setString(4, employee.getEmpEmail());
			gc.ps.setInt(5, employee.getDeptId());

			return gc.ps.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		String sql = "delete from emp where empid =?";
		GetConnection gc = new GetConnection();

		try {
			gc.ps = GetConnection.getPostGresConnection().prepareStatement(sql);
			gc.ps.setInt(1, empId);
			return gc.ps.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateEmployeeSalary(int empId, double empSal) {

		String sql = "update emp set empsal = ? where empid = ?";

		GetConnection gc = new GetConnection();
		try {
			gc.ps = GetConnection.getPostGresConnection().prepareStatement(sql);
			gc.ps.setDouble(1, empSal);
			gc.ps.setInt(2, empId);

			return gc.ps.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public Employee getemployee(int empId) {
		String sql ="select empname,empsal,empemail,deptid from emp where empid=?";
		
		GetConnection gc = new GetConnection(); 
		
		try {
			gc.ps = GetConnection.getPostGresConnection().prepareStatement(sql);
			
			gc.ps.setInt(1, empId);
			
			gc.rs1 = gc.ps.executeQuery(); 
			
			// there is no hasNext method 
			if(gc.rs1.next()) {
				Employee employee = new Employee(); 
				employee.setEmpId(empId);
				employee.setEmpName(gc.rs1.getString(1));
				employee.setEmpSal(gc.rs1.getDouble(2));
				employee.setEmpEmail(gc.rs1.getString(3));
				employee.setDeptId(gc.rs1.getInt(4));
				return employee; 
			}else {
				System.out.println("Sorry record not found... " + empId);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	
	
	
	
	
	

	@Override
	public List<Employee> getAllEmployees() {
		String sql ="select empid,empname,empsal,empemail,deptid from emp";
		List<Employee> list = new ArrayList<Employee>(); 
		
		GetConnection gc = new GetConnection(); 
		try {
			gc.ps = GetConnection.getPostGresConnection().prepareStatement(sql); 
			
			gc.rs1 = gc.ps.executeQuery(); 
			
			while(gc.rs1.next()) {
				Employee employee = new Employee(); 
				employee.setEmpId(gc.rs1.getInt(1));
				employee.setEmpName(gc.rs1.getString(2));
				employee.setEmpSal(gc.rs1.getDouble(3));
				employee.setEmpEmail(gc.rs1.getString(4));
				employee.setDeptId(gc.rs1.getInt(5));
				
				list.add(employee); 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

}































