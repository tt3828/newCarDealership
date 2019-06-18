package com.revature.ui;


import java.util.Scanner;

import com.revature.pojo.Customer;
import com.revature.pojo.Employee;
//import com.revature.pojo.User;

public class Input{
	
	private static final Scanner SCAN = new Scanner(System.in);
	
	public static String getAnswer() {
		
		String answer = SCAN.nextLine();
		
		if (answer.equals("1")) {
			return answer;
			}
		if (answer.equals("2")) {
		return answer;
		}
		return answer;
		}
	public static void getRegisterInfo() throws Exception {
		
		System.out.println("First name:");
		String firstName = SCAN.nextLine();
		
		System.out.println("Last name:");
		String lastName = SCAN.nextLine();
		
		System.out.println("Email:");
		String email = SCAN.nextLine();
		
		System.out.println("Username: ");
		String userName= SCAN.nextLine();
		
		System.out.println("Password:");
		String password = SCAN.nextLine();
//		if (userType.equals("1")) {
//			Employee newEmployee = new Employee(firstName, lastName, userName, password, "Employee");
//			User.register(newEmployee);
//			System.out.println("WELCOME EMPLOYEE " +userName);
//			System.out.println("What would you like to do?");
//			
//		
			
		}
	
		
		/*
		 * try {
		 * User.login(loguserName, logpassword);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 */
			
		
		
	}
		
	
	


