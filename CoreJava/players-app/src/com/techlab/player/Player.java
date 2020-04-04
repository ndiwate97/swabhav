package com.techlab.player;

public class Player {

	private int id, age;
	private String name ;
	private char creditPoints;
	private final static int DEFAULT_AGE = 18;
	private final static int START_RANGE = 0;

	public Player(int id, String name, int age, char creditPoints) {
		this.id = checkIntValue(id);
		this.name = checkStringValue(name);
		this.age = checkAge(age);
		this.creditPoints = creditPoints;
	}

	public Player(int id, String name, char creditPoints) {
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

	public Player whoIsBetterPlayer(Player p) {
		if((int)this.creditPoints<(int)p.creditPoints)
			return this;
		else 
			return p;
		
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
