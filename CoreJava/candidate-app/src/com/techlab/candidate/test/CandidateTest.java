package com.techlab.candidate.test;
import com.techlab.candidate.Candidate;
import com.techlab.candidate.CreditPoint;

public class CandidateTest {
	
	public static void main(String[] args) {
		Candidate c1 = new Candidate(10, 25, "abc", CreditPoint.A);
		printInfo(c1);
		
		Candidate c2 = new Candidate(-10, 30, "xyz", CreditPoint.B);
		printInfo(c2);
	}

	private static void printInfo(Candidate c) {
		System.out.println("\nId = "+c.getId());
		System.out.println("Name = "+c.getName());
		System.out.println("Age = "+c.getAge());
		System.out.println("Credit Point = "+c.getCreditPoint());
	}

}
