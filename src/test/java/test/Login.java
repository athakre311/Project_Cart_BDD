package test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	@Given("user navigate to login page")
	public void user_navigate_to_login_page() {
		System.out.println("HEllo Abby step ===== 001");
	}

	@When("User entered valid email address {string}")
	public void user_entered_valid_email_address(String string) {
		System.out.println("HEllo Abby step ===== 002");

	}

	@When("User has entered valid password {string}")
	public void user_has_entered_valid_password(String string) {
		System.out.println("HEllo Abby step ===== 003");

	}

	@When("User clickes on Login button")
	public void user_clickes_on_login_button() {
		System.out.println("HEllo Abby step ===== 004");

	}

	@Then("User should get successfully logged in")
	public void user_should_get_successfully_logged_in() {
		System.out.println("HEllo Abby step ===== 005");
	}
	
	@When("User entered invalid email address {string}")
	public void user_entered_invalid_email_address(String string) {
		System.out.println("HEllo Abby step ===== 006");
	}

}
