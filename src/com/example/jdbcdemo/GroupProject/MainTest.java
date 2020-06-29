package com.example.jdbcdemo.GroupProject;

import java.util.Scanner;

import com.mysql.cj.protocol.x.ContinuousOutputStream;

public class MainTest {
	static boolean cont = true;
	static Scanner usrinput = new Scanner(System.in);
	static String option;
	static String name;
	static int id;
	static double balance;
	static double amount;
	static double phoneNo;
	static String Address;

	public static void main(String[] args) {
		UserDao user = new UserDao();
		
		while (cont) {

			menu();
			option = usrinput.nextLine();

			// switch case to perform different options.
			switch (option) {
			case "A": {
				System.out.println("Please give the following information:");
				System.out.print("Name: ");
				name = usrinput.nextLine();
				System.out.print("id: ");
				id=Integer.parseInt(usrinput.nextLine());
				System.out.print("Address");
				Address=usrinput.nextLine();
				System.out.print("Phone No:");
				phoneNo=Double.parseDouble(usrinput.nextLine());
				System.out.print("Initial Balance: ");
				balance=Double.parseDouble(usrinput.nextLine());
				user.addUserInf(new AccountInfo(id,name,Address,phoneNo), balance);
				break;
			}
			case "B": {
				System.out.print("Please enter the id of the account to deposit into: ");
				id=Integer.parseInt(usrinput.nextLine());
				System.out.print("PLease enter the amount to be deposited: ");
				amount=Double.parseDouble(usrinput.nextLine());
				user.deposit_amt(id, amount);
				break;

			}
			case "C": {
				System.out.print("Please enter the id of the account to withdraw from: ");
				id=Integer.parseInt(usrinput.nextLine());
				System.out.print("PLease enter the amount to be withdrawn: ");
				amount=Double.parseDouble(usrinput.nextLine());
				user.withdraw_amt(id, amount);
				break;
			}
			default: {
				System.out.println("Invalid input");
				continue;
			}
			}
			System.out.print("\nDo you want to try another option(yes or no):");
			String optn=usrinput.nextLine();
			if (optn.equals("yes")) cont=true;
			else cont=false;
			System.out.println("===========================");
		}
	}

	static void menu() {
		System.out.println("PLease choose from one of the following:");
		System.out.println("A:open account     B:deposit         C:withdraw");
		System.out.println("-----------------------------------------");

	}
}
