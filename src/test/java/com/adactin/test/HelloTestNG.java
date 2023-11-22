package com.adactin.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HelloTestNG {

	@DataProvider(name = "login")
	public static Object[][] credentials() {

		return new Object[][] { { "username1", "password1" }, { "username2", "password2" } };
	}

	@Test(dataProvider ="login")
	void testcase(String []a) {

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		

	}

}
