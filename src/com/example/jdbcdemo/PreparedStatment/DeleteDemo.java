package com.example.jdbcdemo.PreparedStatment;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.example.jdbcdemo.util.DbUtil;

public class DeleteDemo {
	
	public static final String SQL="delete from user_tbl where id=?";

	public static void main(String[] args) {
		
		try(PreparedStatement ps=DbUtil.getConnection().prepareStatement(SQL);){
			ps.setInt(1,4);
			ps.executeUpdate();
			System.out.println("Data deleted using prepared statement.");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
