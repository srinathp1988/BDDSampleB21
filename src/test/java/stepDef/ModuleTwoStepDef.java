package stepDef;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ModuleTwoStepDef {

	
@Before(order =1, value="@Regression")
	
	public void initiChrome() {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("Chrome initialized");
	}


@Before(order =2, value="@Regression")

public void order2RegTest() {
    // Write code here that turns the phrase above into concrete actions
  System.out.println("order2RegTest");
}


@Before(order =1, value="@SmokeTest")

public void order1SmokeTest() {
    // Write code here that turns the phrase above into concrete actions
  System.out.println("order1SmokeTest");
}


@Before(order =2, value="@SmokeTest")

public void order2SmokeTest() {
// Write code here that turns the phrase above into concrete actions
System.out.println("order2SmokeTest");
}


@When("User updates his contact details")
public void user_updates_his_contact_details() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Update contact");
}



	
}