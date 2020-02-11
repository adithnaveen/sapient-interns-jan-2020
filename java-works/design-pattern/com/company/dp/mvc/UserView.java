package com.company.dp.mvc;

public abstract class UserView {
	public abstract void printEmployee(Employee employee);

	public static UserView getView(String viewName) {
		if (viewName.equals(View.STAR)) {
			return new EmployeeViewStar();
		} else if (viewName.equals(View.DASH)) {
			return new EmployeeViewDash();
		}

		return null;
	}
}

class EmployeeViewStar extends UserView {

	@Override
	public void printEmployee(Employee employee) {
		System.out.println("*****************************************************");
		System.out.println("Employee Id :" + employee.getEmpId());
		System.out.println("Employee Name :" + employee.getEmpName());
		System.out.println("Employee Salary :" + employee.getEmpSal());
		System.out.println("*****************************************************");
	}

}

class EmployeeViewDash extends UserView {

	@Override
	public void printEmployee(Employee employee) {

		System.out.println("-----------------------------------------------------");
		System.out.println("Employee Id :" + employee.getEmpId());
		System.out.println("Employee Name :" + employee.getEmpName());
		System.out.println("Employee Salary :" + employee.getEmpSal());
		System.out.println("-----------------------------------------------------");
	}
}
