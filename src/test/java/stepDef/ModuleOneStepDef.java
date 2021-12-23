package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ModuleOneStepDef {

	

	@Given("User is logged in")
	public void user_is_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("user is logged in");
	}
	@When("user create a new Deal")
	public void user_create_a_new_deal() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user create a new Deal");
	}


	@When("User view his Deal details")
	public void user_view_his_deal_details() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User view his Deal details");
	}
	@When("User update his Deal details")
	public void update_view_his_deal_details() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User update his Deal details");
	}
	
	
	@When("user create a new contact")
	public void user_create_a_new_contact() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user create a new contact");
	}
	@When("user views a new contact")
	public void user_views_a_new_contact() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user views a new contact");
	}
	@When("user updates his contact details")
	public void user_update_a_new_contact() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user updates his contact details");
	}






}
