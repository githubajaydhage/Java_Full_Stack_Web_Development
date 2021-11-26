package com;

import java.util.ArrayList;
import java.util.List;

public class ItTeam {

				public float getBonus(int id, String name, float salary, String desg) {
					if(desg.equals("Manager")) {
						return salary+10000;
					}else if(desg.equals("Developer")) {
						return salary +5000;
					}else {
						return salary+3000;
					}
				}
				
				public List<String> getSkillSet() {
					List<String> listOfSkill = new ArrayList<>();
					listOfSkill.add("Java");
					listOfSkill.add("Python");
					listOfSkill.add("Angular");
					listOfSkill.add("Aws");
					return listOfSkill;
				}
}
