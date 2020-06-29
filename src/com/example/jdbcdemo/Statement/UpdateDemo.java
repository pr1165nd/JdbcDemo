package com.example.jdbcdemo.Statement;

import java.sql.SQLException;
import java.sql.Statement;

import com.example.jdbcdemo.util.DbUtil;

public class UpdateDemo {

	public static final String SQL="update user_tbl set user_name='shyam nepal',age=33 where id=2";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			try (	Statement st =DbUtil.getConnection().createStatement();){
				st.executeUpdate(SQL);
				System.out.println("Data updated.");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
