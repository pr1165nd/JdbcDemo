package com.vastika.jdbcdemo.Statement;

import java.sql.SQLException;
import java.sql.Statement;

import com.vastika.jdbcdemo.util.DbUtil;

public class DeleteDemo {

	
	public static final String SQL="delete from user_tbl where id=2";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			try (	Statement st =DbUtil.getConnection().createStatement();){
				st.executeUpdate(SQL);
				System.out.println("Data deleted.");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
