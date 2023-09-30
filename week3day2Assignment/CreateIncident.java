package week3day2Assignment;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import io.restassured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class CreateIncident extends Baseclass{
	
	@Test
	public void create()
	{
		
		input=RestAssured.given()
		.contentType("application/json")
		.when().body("{\r\n"
				+ "  \"fields\": {\r\n"
				+ "    \"project\": {\r\n"
				+ "      \"key\": \"TES\"\r\n"
				+ "    },\r\n"
				+ "    \"summary\": \"create issue in RA project\",\r\n"
				+ "    \"description\": \"Creating of an issue using project keys and issue type names using the REST API\",\r\n"
				+ "    \"issuetype\": {\r\n"
				+ "      \"name\": \"Bug\"\r\n"
				+ "    }\r\n"
				+ "  }\r\n"
				+ "}");
		output=input.post();
		ID = output.jsonPath().get("id");
		inckey = output.jsonPath().get("key");
		System.out.println(ID+"\n"+inckey);
		output.then().assertThat().statusCode(Matchers.equalTo(201));
		output.prettyPrint();

	}
}
