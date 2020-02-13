package com.company.dp.mvc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class EmployeeController {
	private Employee model;
	private UserView view;

	public void updateView() {
		view.printEmployee(model);
	}

}
