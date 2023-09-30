package week3day2Assignment;

import java.util.List;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getinc extends Baseclass{

	@Test(dependsOnMethods="week3day2Assignment.CreateIncident.create")
	public void getinc()
	{
		input=RestAssured.given();
		output = input.get("13586");
		//List<Object> sysid = output.jsonPath().getList("/inckey");
		//System.out.println(sysid.size());
		output.then().assertThat().statusCode(Matchers.equalTo(200));
		output.prettyPrint();
		
	}
}
