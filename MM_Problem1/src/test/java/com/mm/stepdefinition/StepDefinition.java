package com.mm.stepdefinition;

import org.testng.Assert;

import com.mm.pageobjectmodel.PageObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends PageObject {

	String val1, val2, val3, val4, val5, totalString;
	int totalValue = 0, totalBalance;
	public boolean visible;

	@Given("Populate input in all textbox from value1 to value5")
	public void populate_input_in_all_textbox_from_value1_to_value5() {
		// Write code here that turns the phrase above into concrete actions

		val1 = value_1();
		val2 = value_2();
		val3 = value_3();
		val4 = value_4();
		val5 = value_5();

		throw new io.cucumber.java.PendingException();
	}

	@Given("Add all the values")
	public void add_all_the_values() {
		// Write code here that turns the phrase above into concrete actions
		totalString = val1.concat(val2).concat(val3).concat(val4).concat(val5);
		String[] stringArr = totalString.split("$");

		for (String s : stringArr) {
			totalValue += Integer.parseInt(s);
		}

		throw new io.cucumber.java.PendingException();
	}

	@When("Sum of all values is greater than total balance")
	public void sum_of_all_values_is_greater_than_total_balance() {
		// Write code here that turns the phrase above into concrete actions

		String[] totalBal = totalBalance().split("$");

		totalBalance = Integer.parseInt(totalBal[1]);

		if (totalValue > totalBalance) {
			Assert.assertTrue(true);
		}

		throw new io.cucumber.java.PendingException();
	}

	@Then("System should pop exceeding error message")
	public void system_should_pop_exceeding_error_message() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("less balance");

		throw new io.cucumber.java.PendingException();
	}

	@When("Sum of all values is equal or less than total balance")
	public void sum_of_all_values_is_equal_or_less_than_total_balance() {
		// Write code here that turns the phrase above into concrete actions
		if (totalValue <= totalBalance) {
			Assert.assertTrue(true);
		}

		throw new io.cucumber.java.PendingException();
	}

	@Then("System should not pop any error message")
	public void system_should_not_pop_any_error_message() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("s");

		throw new io.cucumber.java.PendingException();
	}

	@Given("Validate visibility of the values")
	public void add_validate_visibility_of_the_values() {
		// Write code here that turns the phrase above into concrete actions

		Assert.assertTrue(value1.isDisplayed());
		Assert.assertTrue(value2.isDisplayed());
		Assert.assertTrue(value3.isDisplayed());
		Assert.assertTrue(value4.isDisplayed());
		Assert.assertTrue(value5.isDisplayed());

		visible = true;

		throw new io.cucumber.java.PendingException();
	}

	@When("Values are not visible")
	public void values_are_not_visible() {
		// Write code here that turns the phrase above into concrete actions
		if (visible) {
			System.out.println("all values are visible");
		} else
			visible = false;
	}

	@Then("System should pop visibility error message")
	public void system_should_pop_visibility_error_message() {
		// Write code here that turns the phrase above into concrete actions

		if (visible == false) {
			System.out.println("values are not visible");
		}

		throw new io.cucumber.java.PendingException();
	}

}
