package com.revature.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.pojo.Car;
import com.revature.util.ConnectionFactory;

public class CarDaoImpl implements CarDao {

	private Connection conn = ConnectionFactory.getConnection();

	@Override
	public void addCar(Car c) {
		Car ret = null;
		String sql = "insert into Dealership_Car(car_id, year, make, model, price, available) VALUES (?, ?, ?, ?, true)";
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				ret = new Car(1, sql, sql, sql, 0, true);
				ret.setId(rs.getInt(1));
				ret.setYear(rs.getString("year"));
				ret.setMake(rs.getString("make"));
				ret.setModel(rs.getString("model"));
				ret.setPrice(rs.getInt(1));
				ret.setavailable(true);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void removeCar(int id) {

		String sql = "delete from project_car where carid =" + id;
		Statement stmt ;
		try {
			stmt= conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			System.out.println("not working");
		}
	}

	@Override
	public void getCarById(int id) {
		
		String sql = "select * from project_car where carID=" + id;
		Statement stmt ;
		try {
			stmt= conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("not working");
		}
		
	}

	
	@Override


	public void getAllCars() {
		
		String sql = "select * from project_car";
		Statement stmt ;
		try {
			stmt= conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("not working");
		}
	}
	


}

