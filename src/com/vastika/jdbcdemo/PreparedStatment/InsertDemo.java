package com.vastika.jdbcdemo.PreparedStatment;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.vastika.jdbcdemo.util.DbUtil;

public class InsertDemo {

	public static final String SQL="insert into user_tbl(user_name,age)values(?,?)";

	
	//prepared statement gives more security 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(PreparedStatement ps=DbUtil.getConnection().prepareStatement(SQL);){
			ps.setString(1,"Krishna");
			ps.setInt(2, 32);
			ps.executeUpdate();
			System.out.println("Data inserted using prepared statment");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
