package com.adactin.test;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},	
					features="features",
					glue="com.adactin.stepdef",
					tags="@AdactInTesting",
					strict=true,
					dryRun=false,
					monochrome=true
					)

public class Edge_TestRunner {
	

	

}
