package week3day2Assignment;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Baseclass {

	public static String ID;
	public RequestSpecification input;
	public static Response output;
	public static String inckey;
	@BeforeMethod
	public void precondition()
	{
		RestAssured.baseURI="https://testjirafeb2023.atlassian.net/rest/api/2/issue/";
		//RestAssured.authentication=RestAssured.basic("admin","SEh8Rr!tG5i@");
		RestAssured.authentication=RestAssured.preemptive().basic("Feb2023restAPI@gmail.com", "ATATT3xFfGF0CZiGXCUwHo93XsMP911slG-UUfAHChE4jd_-fX_Ulmd_Ui6VlgexQAaDGRTWq3_rOXi2tHjVS2rdd38SHkIujpQLjjQhkfgXgg4LXCgcVl8hFnxMkQFwEnPjXGb86wnV-gVNjEDgMOAxtFsai4wo5W06-WdirEpVL4jcJIjkX-I=E01A998A");
	}
}
