package com.techlab.organisation;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Organisation {

	private UUID orgId;
	private String name;
	private Date registrationDate;
	private ArrayList<Partner> partnerList = new ArrayList<Partner>();
	private ArrayList<Talent> talentList = new ArrayList<Talent>();

	public Organisation(String name, Date registrationDate) {
		orgId = UUID.randomUUID();
		this.name = name;
		this.registrationDate = registrationDate;
	}

	public UUID getId() {
		return orgId;
	}

	public String getName() {
		return name;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public ArrayList<Partner> getPartnerList() {
		return partnerList;
	}

	public ArrayList<Talent> getTalentList() {
		return talentList;
	}

	public void addTalent(Talent t) {
		boolean unique = true;
			for (Talent talent : talentList) {
				if (talent.getId() == t.getId() && talent.getName().equalsIgnoreCase(t.getName())) {
					unique=false;
					break;
				}
			}

		if (unique)
			talentList.add(t);
		else
			System.err.println("Talent Already Present");
	}

	public void addPartner(Partner p) {

		boolean unique = false;
		if (!partnerList.isEmpty()) {
			for (Partner partner : partnerList) {
				if (partner.getId() != p.getId() && !partner.getName().equalsIgnoreCase(p.getName())) {
					unique = true;
				}
			}
		} else
			unique = true;

		if (unique)
			partnerList.add(p);
		else
			System.err.println("Partner Already Present");

	}

}

/*
 * add UUID for orgID add unique partners and talent
 */