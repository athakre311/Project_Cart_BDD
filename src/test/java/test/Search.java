package test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {

	@Given("User open the applicaion")
	public void user_open_the_applicaion() {
		System.out.println("Search Abby step ===== 001");

	}

	@When("User enters valid product {string} into Search box field")
	public void user_enters_valid_product_into_search_box_field(String string) {
		System.out.println("Search Abby step ===== 002");
;
	}

	@When("User clicks on Search button")
	public void user_clicks_on_search_button() {
		System.out.println("Search Abby step ===== 003");

	}

	@Then("User should get valid product displayed in search result")
	public void user_should_get_valid_product_displayed_in_search_result() {
		System.out.println("Search Abby step ===== 004");

	}

}
