package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Gmaillogin {
	
	@Given("user should be registered")
	void precondition() {
		System.out.println("User is registered");
	}
	@When("open gmail and enter valid credentials")
	void teststep() {
		System.out.println("Email:revankole@gmail.com & password:Revan@2005");

	}
	@Then("gmail login should be successful")
	void expectedresult() {
		System.out.println("Login successfull");

	}
}
