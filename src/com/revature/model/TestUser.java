package com.revature.model;

public class TestUser {

	public static void main(String[] args) {
		User user=new User();
        user.setName("agalya");  
        user.setEmail("agal@gmail.com");
       user.setPassword("123abc");
             
		System.out.println(user.getName());
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		System.out.println(user);
		// TODO Auto-generated method stub

	}

}
