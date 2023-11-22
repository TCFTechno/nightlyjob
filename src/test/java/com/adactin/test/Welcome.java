package com.adactin.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Welcome {
	/*
	 * url: https://reqres.in/ path: /api/register
	 * 
	 * { "email": "eve.holt@reqres.in", "password": "pistol" }
	 */

	@Test
	public void postmehtod() {

		String payload = "{\r\n" + "		    \"email\": \"eve.holt@reqres.in\",\r\n"
				+ "		    \"password\": \"pistol\"\r\n" + "		}";
		RequestSpecification request = RestAssured.given();

		request.baseUri("https://reqres.in");
		request.param("/api/register");
		request.body(payload);

		Response response = request.post();

		String asPrettyString = response.body().asPrettyString();

		int statusCode = response.statusCode();
		Assert.assertEquals(statusCode, 201);
		System.out.println(asPrettyString);
	}
}
