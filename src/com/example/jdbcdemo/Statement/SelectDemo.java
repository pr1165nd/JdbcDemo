package com.example.jdbcdemo.Statement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.jdbcdemo.util.DbUtil;

public class SelectDemo {
	//read data from database
	public static final String SQL="select * from user_tbl";


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(Statement st=DbUtil.getConnection().createStatement();) {
			ResultSet rs= st.executeQuery(SQL);
			while (rs.next()) {
				System.out.println("id is: "+ rs.getInt("id"));			//we can give the index too . 
				System.out.println("username is: " + rs.getString(1));  //using index
				System.out.println("age is: "+ rs.getInt("age"));
				System.out.println("==========================");
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}

}
