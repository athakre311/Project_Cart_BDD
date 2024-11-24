package test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	
	@Given("User navigates to Register Account page")
	public void user_navigates_to_register_account_page() {
		System.out.println("HEllo Abby step ===== 001");

	}

	@When("User enters the details into below fields")
	public void user_enters_the_details_into_below_fields(io.cucumber.datatable.DataTable dataTable) {
		System.out.println("HEllo Abby step ===== 002");

	}

	@When("User select Privercy policy")
	public void user_select_privercy_policy() {
		System.out.println("HEllo Abby step ===== 003");

	}

	@When("User clicks on continue button")
	public void user_clicks_on_continue_button() {
		System.out.println("HEllo Abby step ===== 004");

	}

	@Then("User account should get created successfully")
	public void user_account_should_get_created_successfully() {
		System.out.println("HEllo Abby step ===== 005");

	}


}
