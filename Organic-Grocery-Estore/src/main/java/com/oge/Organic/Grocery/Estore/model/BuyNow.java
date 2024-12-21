package com.oge.Organic.Grocery.Estore.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class BuyNow {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Buynowid;

	private String name,address,phoneno;
	public BuyNow() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BuyNow(String name, String address,  String phoneno ) {
		super();
		this.name = name;
		this.address = address;
		this.phoneno = phoneno;
		
	
	}
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}

	public String getaddress() {
		return address;
	}
	public void setaddress(String address) {
		this.address = address;
	}

	
	public String getphoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	
	
	
	@Override
	public String toString() {
		return " buynow[ name=" + name + ",  address=" + address + ",	phoneno=" + phoneno +   "]";
	}
	public static List<BuyNow> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	public static void deleteById(int ri) {
		// TODO Auto-generated method stub
		
	}
}



