package test;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.testng.annotations.Test;

import com.ItTeam;

public class ItTeamTest {

  @Test(groups = {"bonus"})
  public void getBonusTest() {
    //throw new RuntimeException("Test not implemented");
	  ItTeam it = new ItTeam();
	  float updatedSalary	= it.getBonus(100, "Raj", 45000, "Manager");
	  assertEquals(updatedSalary, 55000);
  }
  @Test
  public void getSkillSetTest() {
    //throw new RuntimeException("Test not implemented");
	  ItTeam it = new ItTeam();
	  List<String> listOfSkillSet	=  it.getSkillSet();
	  assertEquals(listOfSkillSet.size(), 4);
  }
}
