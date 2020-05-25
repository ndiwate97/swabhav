package com.techlab.organisation.test;

import java.util.Date;

import com.techlab.organisation.Organisation;
import com.techlab.organisation.Partner;
import com.techlab.organisation.Talent;

public class OrganisationTest {

	public static void main(String[] args) {

		Partner p1 = new Partner(201, "Partner1", 5000000);
		p1.addTalent(new Talent(20101, "Partner1 Talent1", 7.5));
		p1.addTalent(new Talent(20102, "Partner1 Talent2", 7.5));

		printPartnerInfo(p1);

		Partner p2 = new Partner(202, "Partner2", 60000000);
		p2.addTalent(new Talent(20201, "Partner2 Talent1", 6.95));
		p2.addTalent(new Talent(20202, "Partner2 Talent2", 8.65));

		printPartnerInfo(p2);

		Organisation o = new Organisation( "First Org", new Date());
		o.addTalent(new Talent(101, "Talent1", 7.5));
		o.addTalent(new Talent(102, "Talent2", 6.89));
		o.addTalent(new Talent(102, "Talent2", 6.89));
		o.addPartner(p1);
		o.addPartner(p2);

		printOrganisationInfo(o);

	}

	private static void printPartnerInfo(Partner p) {
		System.out.println("Partner :\n" + p.getId() + "\t" + p.getName());
		System.out.println("Turn over of Partner : " + p.getCompanyTurnOver());
		System.out.println("Current employee Strength : " + p.getCompanyStrength());
		System.out.println("Talents : " + p.getTalentList());
		System.out.println("\n");
	}

	private static void printOrganisationInfo(Organisation o) {
		System.out.println("Organisation : " + o.getId() + "\t" + o.getName());
		System.out.println("Registration Date" + o.getRegistrationDate());
		System.out.println("Current Organisation Talent" + o.getTalentList());
		System.out.println("Current Partners : " + o.getPartnerList());
		System.out.println("\n");
	}

}
