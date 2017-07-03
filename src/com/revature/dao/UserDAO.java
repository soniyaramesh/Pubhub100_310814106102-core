package com.revature.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.Utill.ConnectionUtil;
import com.revature.model.User;

public class UserDAO {
	public  void register(User user ) {
		
		   java.sql.Connection connection = ConnectionUtil.getconnection();
		    PreparedStatement pst=null;
			try {
				pst = connection.prepareStatement("INSERT INTO users (NAME,email,PASSWORD)VALUES(?,?,?)");
			
				pst.setString(1, user.getName());
				pst.setString(2,user.getEmail());
				pst.setString(3, user.getPassword());
				pst.executeUpdate();
				}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			}
	
			public  boolean login(User user ) {
				
				   java.sql.Connection connection = ConnectionUtil.getconnection();
				    PreparedStatement pst=null;
				    boolean flag=false;
					try {
						pst = connection.prepareStatement("SELECT  id,NAME,email,PASSWORD FROM users where email=? and PASSWORD=?");
						pst.setString(1,user.getEmail());
						pst.setString(2, user.getPassword());
						ResultSet rs=pst.executeQuery();
						
						if (rs.next()){
							flag=true;
						}
						
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					return flag;
					
					
					}

}
