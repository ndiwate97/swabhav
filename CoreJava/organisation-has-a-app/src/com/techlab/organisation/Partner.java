package com.techlab.organisation;

import java.util.ArrayList;

public class Partner {

	private int id;
	private String name;
	private double companyTurnOver;
	private int companyStrength = 0;
	private ArrayList<Talent> talentList = new ArrayList<Talent>();

	public Partner(int id, String name, double companyTurnOver) {
		this.id = id;
		this.name = name;
		this.companyTurnOver = companyTurnOver;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCompanyTurnOver() {
		return companyTurnOver;
	}

	public int getCompanyStrength() {
		return companyStrength;
	}

	public ArrayList<Talent> getTalentList() {
		return talentList;
	}

	public void addTalent(Talent t) {
		boolean unique = false;
		if (!talentList.isEmpty()) {
			for (Talent talent : talentList) {
				if (talent.getId() != t.getId() && !talent.getName().equalsIgnoreCase(t.getName())) {
					unique = true;
				}
			}
		} else
			unique = true;

		if (unique)
			talentList.add(t);
		else
			System.err.println("Talent Already Present");
		
		companyStrength++;
	}

	@Override
	public String toString() {
		return "\nId = " + id + ", Name = " + name + ", Company TurnOver = " + companyTurnOver + ", CompanyStrength = "
				+ companyStrength + ", \nTalent in Company = " + talentList;
	}

}
