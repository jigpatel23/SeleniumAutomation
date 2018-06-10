/**
 * 
 */
package apiTest;

import java.util.ArrayList;
import org.testng.Assert;
import org.testng.annotations.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/**
 * @author Jignesh
 *  API test using restAssured
 *
 */

public class GetMethod {

	public static RequestSpecification request = RestAssured.given();
	static Response response;

	@BeforeTest
	public void setUp() {

		// RestAssured.baseURI = "http://restcountries.eu/rest/v1/";
		response = request.get("http://restcountries.eu/rest/v1/");
		// http://restapi.demoqa.com/utilities/weather/city/london
	}

	@Test // (enabled = false)
	public void responseCode() {

		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		System.out.println("Status code is: " + statusCode);
	}

	@Test
	public void getMethod() {

		// response = request.get("name/norway");

		JsonPath jsonPathEvaluator = response.jsonPath();
		ArrayList<String> cityNames = jsonPathEvaluator.getJsonObject("name");
		ArrayList<String> capitals = jsonPathEvaluator.getJsonObject("capital");
		System.out.println(cityNames.size());
		for (int i = 0; i < cityNames.size(); i++) {
			String cityName = cityNames.get(i).toString();
			String capital = capitals.get(i).toString();
			System.out.println(cityName + "  =  " + capital);
		}

	}

}
