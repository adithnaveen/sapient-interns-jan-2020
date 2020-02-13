package com.company06.db;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAO implements IEmployeeDAO {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public boolean create(Employee employee) {

		String sql = "insert into emp values (?,?,?,?,?)";

		return jdbcTemplate.update(sql, employee.getEmpId(), employee.getEmpName(), employee.getEmpSal(),
				employee.getEmpEmail(), employee.getDeptId())

				> 0;
	}

	public Employee getEmployee(int empId) {
		String sql = "select empemail,deptid,empid,empname,empsal from emp where empid=?";

//		Employee employee = jdbcTemplate.queryForObject(sql, new Object[] {empId},
//						new BeanPropertyRowMapper<Employee>(Employee.class));

		return jdbcTemplate.queryForObject(sql, new Object[] { empId }, new EmployeeRowMapper());

	}

	public Employee updateEmployee(int empId, double newSalary) {
		String sql = "update emp set empsal=? where empid=?";
		jdbcTemplate.update(sql, newSalary, empId);
		return this.getEmployee(empId);
	}

	public boolean deleteEmployee(int empId) {
		String sql = "delete from emp where empid=?";
		return jdbcTemplate.update(sql, empId)>0;
	}

	public List<Employee> getAllEmployees() {
		String sql = "select empemail,deptid,empid,empname,empsal from emp";
		return jdbcTemplate.query(sql, new EmployeeRowMapper());
	}

	public void setDataSource(DataSource ds) {
		this.dataSource = ds;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

}
