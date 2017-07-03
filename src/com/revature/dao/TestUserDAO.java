package com.revature.dao;

import com.revature.model.User;

public class TestUserDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user=new User();
		user.setName("agalya");
       user.setEmail("agal@gmail.com");
        user.setPassword("abc123");
        UserDAO dao= new UserDAO();
        try {
			dao.register(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	}
	}
}


