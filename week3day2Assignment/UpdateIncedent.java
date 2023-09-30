package week3day2Assignment;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateIncedent extends Baseclass{

	@Test(dependsOnMethods="week3day2Assignment.CreateIncident.create")
	public void Update()
	{
		
		input=RestAssured.given()
		.contentType("application/json").when().body("{\r\n"
				+ "    \"fields\": {\r\n"
				+ "        \"description\": \"Updated of an issue using project keys and issue type names using the REST API\"\r\n"
				+ "    }\r\n"
				+ "}");
		output=input.put("/"+ID);
		output.then().assertThat().statusCode(Matchers.equalTo(204));
		output.prettyPrint();
	}
}
