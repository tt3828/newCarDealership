package com.revature.ui;


public class WelcomeScreen implements Screen {

	public static final String WELCOME_MESSAGE = 
			"Welcome to Tevin's Luxury Car Dealership. A good luxury vehicle never failed anyone! \n "
			+ "Would you like to Sign In[1] or Create a new Customer Account[2].";
	
	@Override
	public void display() {
		System.out.println(WELCOME_MESSAGE);
	}
}
