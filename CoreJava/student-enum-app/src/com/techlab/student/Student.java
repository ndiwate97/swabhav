package com.techlab.student;
import com.techlab.student.enums.*;

public class Student {
	private static int defaultId=001;
	private String id;
	private String name, dateOfBirth;
	private Branch branch;
	private GradePoint gradePoint;

	public Student(String name,String dateOfBirth,Branch branch, GradePoint creditPoint) {
		this.id = "S"+defaultId++;
		this.name = checkName(name);
		this.dateOfBirth = dateOfBirth;
		this.gradePoint = creditPoint;
		this.branch = branch;
	}

	private String checkName(String s) {
		if(s.equals(" ")||s.equals("null"))
			return "Unspecified";
		else
			return s;
	}
	
	//getters
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDateOfBirth(){
		return dateOfBirth;
	}
	
	public Branch getBranch() {
		return branch;
	}
	
	public GradePoint getGradePoint() {
		return gradePoint;
	}
}
