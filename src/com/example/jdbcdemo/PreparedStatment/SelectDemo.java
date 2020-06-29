package com.example.jdbcdemo.PreparedStatment;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.jdbcdemo.util.DbUtil;

public class SelectDemo {
	public static final String SQL="select * from user_tbl where id=?";


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(PreparedStatement ps=DbUtil.getConnection().prepareStatement(SQL)) {
			ps.setInt(1,1);
			ResultSet rs= ps.executeQuery();
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
