package com.revature.ui;
import java.util.Scanner;

import com.revature.dao.CarDaoImpl;
public class EmployeeOptions implements Screen {
	
	private static final Scanner SCAN = new Scanner(System.in);


public static void getLoginInfo() {
		
		System.out.println("Username: ");
		String loguserName= SCAN.nextLine();
		
		System.out.println("Password");
		String logpassword = SCAN.nextLine();
		
	do  {	
		System.out.println(" ");	
		System.out.println("WELCOME EMPLOYEE " +loguserName);
		System.out.println("What would you like to do?"
				+ "\n[1] View Cars"
				+ "\n[2] Add Cars"
				+ "\n[3] Remove Cars"
				+ "\n[4] View Offers");
		int answer = SCAN.nextInt();
		switch(answer) {
		
		case 1 :
				viewcars();
				break;
		case 2: 
				addCar();
				break;
		case 3:
				removeFromList();
				break;
		case 4: 
				offerStatus();
			 	break;
		case 5:
				viewpayments();
				break;
		case 6: 
				exit();
				break;
		default: 
				System.out.println("Invalid choices");
			}


		
}


private static void exit() {
	// TODO Auto-generated method stub
	
}


private static void viewpayments() {
	// TODO Auto-generated method stub
	
}


private static void offerStatus() {
	// TODO Auto-generated method stub
	
}


private static void removeFromList() {
	// TODO Auto-generated method stub
	
}


private static void addCar() {
	CarDaoImpl.getAllCars();
	
}


private static void viewcars() {
	
	
}


@Override
public void display() {
	// TODO Auto-generated method stub
	
}
}