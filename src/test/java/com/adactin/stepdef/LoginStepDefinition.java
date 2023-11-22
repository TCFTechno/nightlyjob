package com.adactin.stepdef;

import org.openqa.selenium.WebDriver;
import org.testng.TestRunner;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReadManager;
import com.adactin.pom.LogIn2;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends BaseClass {

	public WebDriver driver = Hooks.driver;

	LogIn2 l = new LogIn2(driver);

	@Given("user alps password alps1234!")
	public void user_alps_password_alps1234() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		String url = FileReadManager.getInstance().getCr().getUrl();

		getUrl(url);

		clickonWebelement(l.getLoginbtn());
		inputValuestoWebelement(l.getUserName(), "alps");

		inputValuestoWebelement(l.getPassword(), "alps1234!");
	}

	@When("Secondly, login into the store.")
	public void secondly_login_into_the_store() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("Thirdly, capture the dashboard title.")
	public void thirdly_capture_the_dashboard_title() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("Finally, logout from the store")
	public void finally_logout_from_the_store() {
		// Write code here that turns the phrase above into concrete actions

	}

}
