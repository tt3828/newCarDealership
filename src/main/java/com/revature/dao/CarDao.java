package com.revature.dao;
import com.revature.pojo.Car;
import java.util.List;


public interface CarDao {
	public void addCar (Car c);
	
	public void removeCar(int id);
	
	public void getCarById(int id);
	
	public void getAllCars();
}
