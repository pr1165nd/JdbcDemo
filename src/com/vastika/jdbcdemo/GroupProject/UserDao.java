package com.vastika.jdbcdemo.GroupProject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.vastika.jdbcdemo.util.DbUtil;
public class UserDao {
	
	String SQL="insert into user_tbl(user_name,age)values('hari',20)";
	
	
	public void addUserInf(account_info a,double balance) {
		String SQL="insert into account_info_tbl(id,name,Address,phoneNo)values("+a.getId()+",'"+a.getName()+"','"+a.getAddress()+"',"+a.getPhoneNo()+")";
		String BLNC_SQL="insert into account_balance_tbl(id,balance)values("+a.getId()+","+balance+")";
		try (	Statement st =DbUtil.getConnection().createStatement();){
			st.executeUpdate(SQL);
			st.executeUpdate(BLNC_SQL);
			System.out.println("New account added");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deposit_amt(int id,double amount) {
		double balance=0;
		String SQL="select balance from account_balance_tbl where id="+id;

		try(Statement st=DbUtil.getConnection().createStatement();) {
			ResultSet rs= st.executeQuery(SQL);
			while(rs.next()) {
				String s=rs.getString(1);
				balance=Double.parseDouble(s);
			}
				balance=balance+amount;
				String BLNC_SQL="update account_balance_tbl set balance="+balance+" where id="+id;
				st.executeUpdate(BLNC_SQL);
				System.out.println("New Balance: "+balance);
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}
	
	
	
	public void withdraw_amt(int id,double amount) {
		double balance=0;
		String SQL="select balance from account_balance_tbl where id="+id;
		try(Statement st=DbUtil.getConnection().createStatement();) {
			ResultSet rs= st.executeQuery(SQL);
			if(rs.next()) {
				String s=rs.getString(1);
				balance=Double.parseDouble(s);
			}
				balance=balance-amount;
				String BLNC_SQL="update account_balance_tbl set balance="+balance+" where id="+id;
				try (	Statement st1 =DbUtil.getConnection().createStatement();){		
					st1.execute(BLNC_SQL);
				}
				System.out.println("Balance: "+balance);
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}

	
	
	
	

}
