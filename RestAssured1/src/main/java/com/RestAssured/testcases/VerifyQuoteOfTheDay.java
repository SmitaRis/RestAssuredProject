package com.RestAssured.testcases;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;



public class VerifyQuoteOfTheDay extends TestBase {
	
	Response res =RestAssured.given()
			.when()
			.get ("https://favqs.com/api/qotd").then().
			extract().response();
	int statusCode=res.getStatusCode();
	ResponseBody body=res.getBody();
	//conver body as string
	String bodyAsString=body.asString();
	//Assert.assertEquals(bodyAsString.toLowerCase().contains("As usual, there is a great woman behind every idiot");

}
