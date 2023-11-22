package Excell_Read;

import com.aventstack.extentreports.util.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Practise {

	
	
	public static void main(String[] args) {
		
		
		RequestSpecification request = RestAssured.given();
		
		
		request.baseUri("https://reqres.in/");
		request.queryParam("page",2);
		request.header("accept", ContentType.JSON.getAcceptHeader());
		request.contentType(ContentType.JSON);
	//	request.auth().basic("dfgdf", "dfghdfg");
		
		Response response2 = request.when().get("/api/users");
		
		String asPrettyString2 = response2.body().asPrettyString();
	
		
		int statusCode = response2.getStatusCode();
		
		System.out.println(statusCode);
		
		if(statusCode==200)
		{
			System.out.println("pass");
		}else {
			
			System.out.println("fail");
		}
		
		System.out.println(asPrettyString2);
		
		
		
		
		

		Response response = request.get("/api/users");
		
		
	}
}
