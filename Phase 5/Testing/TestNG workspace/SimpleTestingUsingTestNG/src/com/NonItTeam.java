package com;

import java.util.ArrayList;
import java.util.List;

public class NonItTeam {

	public float getBonus(int id, String name, float salary, String desg) {
		if(desg.equals("Sales")) {
			return salary+8000;
		}else if(desg.equals("Marketing")) {
			return salary +4000;
		}else {
			return salary+2000;
		}
	}
	
	public List<String> getGraducationDetails() {
		List<String> listOfSkill = new ArrayList<>();
		listOfSkill.add("MBA");
		listOfSkill.add("BCom");
		listOfSkill.add("MCom");
		listOfSkill.add("BCA");
		return listOfSkill;
	}
}
