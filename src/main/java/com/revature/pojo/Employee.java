package com.revature.pojo;

public class Employee {
		
		private int id;
		private String firstname;
		private String lastname;
		private String email;
		private String username;
		private String password;

		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setlastname(String lastname) {
			this.lastname = lastname;
		}
		public String getemail() {
			return email;
		}
		public void setemail(String email) {
			this.firstname = email;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", firstname=" + firstname +" "
					+ ",lastname=" + lastname +", email=" + email +" "
					+ ",username=" + username + ", password=" + password + "]";
		}
		public Employee(int id, String firstname, String lastname, String email, String username, String password) {
			super();
			this.id = id;
			this.firstname = firstname;
			this.lastname = lastname;
			this.email = email;
			this.username = username;
			this.password = password;
		}
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
	}