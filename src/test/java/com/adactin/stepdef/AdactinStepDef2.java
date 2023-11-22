package com.adactin.stepdef;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReadManager;
import com.adactin.helper.PageObjectManager;

import Excell_Read.ReadColumn;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinStepDef2 extends BaseClass {
	public WebDriver driver = Hooks.driver;

	PageObjectManager pom = new PageObjectManager(driver);

	@Given("User able to launch  application")
	public void user_able_to_launch_application() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("welecome");
		String url = FileReadManager.getInstance().getCr().getUrl();
		getUrl(url);
	}

	@When("User enter the username and password Login Page")
	public void user_enter_the_username_and_password_login_page(io.cucumber.datatable.DataTable dataTable) throws Throwable {
		List<Map<String, String>> asMaps = dataTable.asMaps(String.class, String.class);

		String sheet = asMaps.get(0).get("sheet");
		String column = asMaps.get(0).get("column");
		String column1 = asMaps.get(0).get("column1");

		System.out.println(sheet + "  == " + column);
		ArrayList<String> column_0 = ReadColumn.getColumn0(sheet, column);
		ArrayList<String> column_1 = ReadColumn.getColumn1(sheet, column1);

		inputValuestoWebelement(pom.getLp().getUserName(), column_0.get(0));

		inputValuestoWebelement(pom.getLp().getPassWord(), column_1.get(0));

	}

	@When("User Click the signin in Login Page")
	public void user_click_the_signin_in_login_page() {
		// Write code here that turns the phrase above into concrete actions
		clickonWebelement(pom.getLp().getLogIn());
		
	
	}

}
