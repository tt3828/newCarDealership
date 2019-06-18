package com.revature.pojo;

public class Car {

	
	int id;
	String year;
	String make;
	String model;
	int price;
	boolean available;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean getavailable() {
		return true;
	}
	public void setavailable(boolean available) {
		this.available = available;
	}

	
		
	

public Car(int id, String year,String make, 
			String model,  int price, boolean available) {
		super();
		this.id = id;
		this.year = year;
		this.make = make;
		this.model = model;
		this.price = price;
		this.available = available;
		
	}
}