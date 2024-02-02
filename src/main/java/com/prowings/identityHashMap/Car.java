package com.prowings.identityHashMap;

public class Car {
	
	private int makeYear ;
	private String Company;

	public Car() {
		super();
	}

	public Car(int makeYear, String company) {
		super();
		this.makeYear = makeYear;
		Company = company;
	}

	public int getMakeYear() {
		return makeYear;
	}

	public void setMakeYear(int makeYear) {
		this.makeYear = makeYear;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	@Override
	public String toString() {
		return "Car [makeYear=" + makeYear + ", Company=" + Company + "]";
	}
	
	

}
