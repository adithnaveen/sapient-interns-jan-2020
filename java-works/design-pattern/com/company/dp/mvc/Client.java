package com.company.dp.mvc;

public class Client {
	public static void main(String[] args) {
		Employee model = new EmployeeDAO().getEmployee(); 
		
		UserView view = UserView.getView(View.DASH); 
		
		EmployeeController controller = new EmployeeController(model, view); 
		
		// print method is called here 
		controller.updateView(); 

		controller.setView(UserView.getView(View.STAR));

		controller.updateView(); 
	}
}
