package com.simplilearn.estore_cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class LoginSteps {

 @Given("The user is ont he login page")
 public void the_user_has_paid_for_an_order_using_internet_banking() {
     // Write code here that turns the phrase above into concrete actions
	 System.out.println("LOGIN STEP 1: Given");
     //throw new io.cucumber.java.PendingException();
 }
 @When("The user enters email and password on the form")
 public void the_user_enters_email_and_password_in_the_form() {
     // Write code here that turns the phrase above into concrete actions
	 System.out.println("LOGIN STEP 2: When");
     //throw new io.cucumber.java.PendingException();
 }
 @And("The user clicks on the login button - login")
 public void the_user_clicks_on_the_login_button() {
     // Write code here that turns the phrase above into concrete actions
	 System.out.println("LOGIN STEP 3: When");
     //throw new io.cucumber.java.PendingException();
 }
 @Then("The user will navigate to the homepage")
 public void the_user_will_navigate_to_the_home_page() {
     // Write code here that turns the phrase above into concrete actions
	 System.out.println("LOGIN STEP 4: Then");
     //throw new io.cucumber.java.PendingException();
 }

}