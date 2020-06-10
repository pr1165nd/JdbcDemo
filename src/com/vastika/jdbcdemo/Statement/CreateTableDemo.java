package com.vastika.jdbcdemo.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.vastika.jdbcdemo.util.DbUtil;

public class CreateTableDemo {

	
	public static final String SQL="create table user_tbl(id int not null auto_increment, user_name varchar(50), age int, primary key(id))";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Connection co=DbUtil.getConnection();
				Statement st =co.createStatement();
				){
			st.executeUpdate(SQL);
			System.out.println("Table Created.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
