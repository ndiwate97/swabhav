package com.techlab.customer;

public class Customer {
	
	final int START_RANGE=1;
	final int END_RANGE=100;
	
	private int id, age;
	private String name;
	private String email;
	private String address;
	
	//setters
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//getters
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getAddress() {
		return address;
	}
	public int getAge() {
		return age;
	}
	
	//other function
	public String whoIsElder(Customer c1, Customer c2) {
		if(this.getAge()>c1.age&& this.age>c2.age)
			return (this.name);
		else 
			if(c1.age>this.getAge()&& c1.age>c2.age)
				return (c1.name);
			else
				return (c2.name);
		
	}
}
