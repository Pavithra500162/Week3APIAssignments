package week3day2Assignment;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteIncident extends Baseclass{

	@Test(dependsOnMethods="week3day2Assignment.CreateIncident.create")
	public void Delete()
	{
		output=RestAssured.delete(ID);
		output.then().assertThat().statusCode(Matchers.equalTo(204));
	}
}
