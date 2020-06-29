package com.example.jdbcdemo.Statement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.jdbcdemo.util.DbUtil;

public class InsertDemo {

	
	public static final String SQL="insert into user_tbl(user_name,age)values('hari',20)";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (	Statement st =DbUtil.getConnection().createStatement();){
			st.executeUpdate(SQL);
			System.out.println("Data Inserted.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
