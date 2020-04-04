package com.techlab.player;

public class PlayerFlag {

	private int id, age;
	private String name ;
	private char creditPoints;
	private final static int DEFAULT_AGE = 18;
	private final static int START_RANGE = 0;
	private boolean successFlag = false; 
	
	public PlayerFlag(int id, String name, int age, char creditPoints) {
		this.id = checkIntValue(id);
		this.name = checkStringValue(name);
		this.age = checkAge(age);
		this.creditPoints = creditPoints;
	}

	public PlayerFlag(int id, String name, char creditPoints) {
		this(id, name, DEFAULT_AGE, creditPoints);
	}

	// getters

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getCreditPoints() {
		return creditPoints;
	}
	
	public boolean getFlag() {
		return successFlag;
	}

	public void whoIsBetterPlayer(PlayerFlag p) {
		if((int)this.creditPoints<(int)p.creditPoints) 
			this.successFlag = true; 
		else 
			p.successFlag = true;
	}
	

	private int checkAge(int a) {
		if (a < DEFAULT_AGE)
			return DEFAULT_AGE;
		else
			return a;
	}

	private int checkIntValue(int val) {
		if (val < 1)
			return (START_RANGE);
		else
			return (val);
	}

	private String checkStringValue(String s) {
		if (s.isEmpty() || s.equalsIgnoreCase("null"))
			return "Unspecified";
		else
			return s;
	}
}
