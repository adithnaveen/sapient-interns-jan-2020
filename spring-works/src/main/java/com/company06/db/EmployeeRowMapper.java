package com.company06.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setEmpId(rs.getInt("empid"));
		employee.setEmpName(rs.getString("empname"));
		employee.setEmpSal(rs.getDouble("empsal"));
		employee.setEmpEmail(rs.getString("empemail"));
		employee.setDeptId(rs.getInt("deptid"));
		return employee;

	}

}
