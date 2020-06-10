package com.vastika.jdbcdemo.GroupProject;

public class account_info {
	private int id;
	private String name;
	private String address;
	private double phoneNo;
	
	public account_info(int id,String name,String address,double phoneNo) {
		this.id=id;
		this.name=name;
		this.address=address;
		this.phoneNo=phoneNo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(double phoneNo) {
		this.phoneNo = phoneNo;
	}
	

}
