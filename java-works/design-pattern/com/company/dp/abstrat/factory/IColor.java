package com.company.dp.abstrat.factory;

public interface IColor {
	void paidColor(); 
}

class Red implements IColor{

	@Override
	public void paidColor() {
		System.out.println("Car Painting in Red Color");
	}	
}

class Blue implements IColor{

	@Override
	public void paidColor() {
		System.out.println("Car painting in Blue Color..");
	}
	
}
