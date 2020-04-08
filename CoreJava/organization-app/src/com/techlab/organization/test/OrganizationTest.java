package com.techlab.organization.test;

import com.techlab.organization.Organization;

public class OrganizationTest {
	public static void main(String[] args) {
		
		Organization org1 = new Organization(101, "Swabhav", "Andheri");
		
		org1.addPartner("Aurion pro");
		org1.addPartner("Nexsales");
		org1.addPartner("Agarta");
		
		printInfo(org1);
		
	}

	private static void printInfo(Organization org) {
		org.getId();
		System.out.println("Orga name is : "+org.getName());
		org.getAddress();
		System.out.println("Partners are : "+org.getPartner());
		System.out.println("Partner Count : "+org.getCount());
	}
}
