package com.simplilearn.estore_cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class OrderSteps {

 @Given("The user has paid for the order using internet banking")
 public void the_user_has_paid_for_an_order_using_internet_banking() {
     // Write code here that turns the phrase above into concrete actions
	 System.out.println("STEP 1: Given");
     //throw new io.cucumber.java.PendingException();
 }
 @When("The user enters the email and password in the form")
 public void the_user_enters_email_and_password_in_the_form() {
     // Write code here that turns the phrase above into concrete actions
	 System.out.println("STEP 2: When");
     //throw new io.cucumber.java.PendingException();
 }
 @And("The user clicks on the login button")
 public void the_user_clicks_on_the_login_button() {
     // Write code here that turns the phrase above into concrete actions
	 System.out.println("STEP 3: When");
     //throw new io.cucumber.java.PendingException();
 }
 @Then("The user will navigate to the home page")
 public void the_user_will_navigate_to_the_home_page() {
     // Write code here that turns the phrase above into concrete actions
	 System.out.println("STEP 4: Then");
     //throw new io.cucumber.java.PendingException();
 }

}