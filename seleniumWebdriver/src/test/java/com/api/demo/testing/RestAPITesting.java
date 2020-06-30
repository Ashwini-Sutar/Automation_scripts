package com.api.demo.testing;

import static org.testng.Assert.assertEquals;

import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static  org.hamcrest.Matchers.*;

public class RestAPITesting {
	
	Response res ;
	 int statuscode;
	
	@Test(priority = 0, description = "Test the status code of the request")
	
	public void testStatusCode() {
		
	 res = get("http://dummy.restapiexample.com/api/v1/employees");
	 
	 statuscode = res.getStatusCode();
		
		System.out.print("The status code is " +statuscode);
		
		assertEquals(statuscode, 200);
	}
	
	
	 @Test(priority = 1, description = "Test status of request")
	  
	  public void status() {
		  
		  res.then().body("status", equalTo("success"));
		  
	  }
	
	
  @Test(priority = 2, description = "Test the first employee name")
  
  public void empName() {
	  
	  res.then().body("data.employee_name[0]", equalTo("Tiger Nixon"));
	  
  }
  
  @Test()
  
  public void posttesting() {
	  
	  RequestSpecification request = RestAssured.given();
	  
	  request.header("Content-Type", "application/json");
	  
	  JSONObject json =new JSONObject();
	 
	  json.put("name","test");
	  json.put("salary","123");
	  json.put("age","23");
	  
	  request.body(json.toString());
	  
	  Response response = request.post("http://dummy.restapiexample.com/api/v1/create");
	  int statuscode = response.getStatusCode();
	  
	  assertEquals(statuscode, 200);
	 
	  
	  
  }

}
