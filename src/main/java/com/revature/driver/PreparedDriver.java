//package com.revature.driver;
//
//import java.util.Scanner;
//
//import com.revature.dao.UserDao;
//import com.revature.dao.UserDaoImpl;
//import com.revature.pojo.User;
//import com.revature.util.ConnectionFactory;
//
//public class PreparedDriver {
//
//	private static UserDao userDao = new UserDaoImpl(ConnectionFactory.getConnection());
//
//	public static void main(String[] args) {
//		System.out.println("Do you wish to change your password?");
//
//		Scanner sc = new Scanner(System.in);
//		if ("yes".equals(sc.nextLine().toLowerCase())) {
//			/*
//			 * System.out.println("Please enter your id"); Integer id = sc.nextInt();
//			 * sc.nextLine();
//			 */
//			System.out.println("Please enter new username");
//			String username = sc.nextLine();
//			System.out.println("Please enter new password");
//			String password = sc.nextLine();
//			userDao.preparedUpdateUser(new User(-1, username, password));
//		}
//
//	}
//
//}

package com.revature.driver;
import java.sql.DriverManager;
import java.sql.Connection;
import com.revature.pojo.Employee;
import com.revature.ui.EmployeeOptions;
import com.revature.ui.Input;
import com.revature.ui.LoginScreen;
import com.revature.ui.RegisterScreen;
import com.revature.ui.Screen;
import com.revature.ui.WelcomeScreen;
import com.revature.util.ConnectionFactory;

public class PreparedDriver {
	
	
	private static Screen welcome = new WelcomeScreen();
	private static Screen register = new RegisterScreen();
	private static Screen login = new LoginScreen();
	private static Screen employee = new EmployeeOptions();
//	private static Screen customer = new CustomerOptions();
	
	public static void main(String[] args) throws Exception {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection conn = ConnectionFactory.getConnection();
		welcome.display();
		String response = Input.getAnswer();
		if (response.contentEquals("1")) {
		login.display();
		EmployeeOptions.getLoginInfo();
		//employee.display();
		}
		else {
			register.display();
			Input.getRegisterInfo();
			
		}
		
		
	}
}