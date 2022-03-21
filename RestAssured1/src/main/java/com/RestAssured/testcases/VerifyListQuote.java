package com.RestAssured.testcases;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import junit.framework.Assert;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;

public class VerifyListQuote extends TestBase {
//  Again easy assertion for status code in all Pets List
    @Test
    public void shouldHaveStatus200ForListQuoteOfTheDay() {
    	Response res =RestAssured.given()
    			.header("key","7a17edeccd500458c0d32febbb48367f")
    			.when()
    			.get ("https://favqs.com/api/quotes/?filter=funny").then().
    			extract().response();
    	int statusCode=res.getStatusCode();
    	Assert.assertEquals(statusCode, 200);
    	
    }
    
    
    
    
    
    
}