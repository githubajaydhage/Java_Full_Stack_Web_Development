package test;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.testng.annotations.Test;

import com.NonItTeam;

public class NonItTeamTest {

  @Test(groups = {"bonus"})
  public void getBonusTest() {
    //throw new RuntimeException("Test not implemented");
	  NonItTeam nt = new NonItTeam();
	  float updatedSalary = nt.getBonus(100, "Raj", 12000, "Clerk");
	  assertEquals(updatedSalary, 14000);
  }

  @Test
  public void getGraducationDetailsTest() {
  //  throw new RuntimeException("Test not implemented");
	  NonItTeam nt = new NonItTeam();
	  List<String> graducationInfo  = nt.getGraducationDetails();
	  assertEquals(graducationInfo.contains("MBA"), true);
  }
}
