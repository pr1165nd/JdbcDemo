package com.example.jdbcdemo.PreparedStatment;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.jdbcdemo.util.DbUtil;

public class UpdateDemo {
	public static final String SQL="update user_tbl set user_name=?,age=? where id=?";
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (	PreparedStatement ps =DbUtil.getConnection().prepareStatement(SQL);){
			
			ps.setString(1, "New");
			ps.setInt(2, 29);
			ps.setInt(3, 1);
			ps.executeUpdate();
			System.out.println("Data Updated using prepared statement.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
