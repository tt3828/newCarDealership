//package com.revature.driver;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//import com.revature.ui.Input;
//import com.revature.ui.LoginScreen;
//import com.revature.ui.RegisterScreen;
//import com.revature.ui.Screen;
//import com.revature.ui.WelcomeScreen;
//import com.revature.util.ConnectionFactory;
//
//public class JDBCDriver {
//	public static Connection connect() {
//	final String username = "tevinthomas";
//	final String url = "jdbc:postgresql://tevin-tt3828.cjf0qra7vy9s.us-east-2.rds.amazonaws.com:5432/tevin_tt3828?";
//	final String password = "Terrell12";
//	
//	
//	
//
//	try {
//		Connection conn = DriverManager.getConnection(username, url, password);
//	} catch (Exception a) {
//		System.out.println("You are a failure");
//	}
//	return connect();
//	}
//		private static Screen welcome = new WelcomeScreen();
//		private static Screen register = new RegisterScreen();
//		private static Screen login = new LoginScreen();
//	public static void main(String[] args) {
//		
////		private static Screen employee = new EmployeeOptions();
////		private static Screen customer = new CustomerOptions();
//			welcome.display();
//			String response = Input.getAnswer();
//			if (response.contentEquals("1")) {
//			login.display();
//			Input.getLoginInfo();
//			//employee.display();
//			}
//			else {
//				register.display();
//				try {
//					Input.getRegisterInfo();
//				} catch (Exception e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
//			}
//			
//			
//		}
//	}

