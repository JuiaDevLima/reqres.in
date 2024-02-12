package api.test.register;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestRegisterSucessfull {
	Response response;

	@Test
	public void testStatusCode() {
		response = RestAssured.get("https://reqres.in/api/register");
		assertEquals(200, response.getStatusCode());
	}
	
	@Test
	public void testRegisterSucessfull() {
		String url = "https://reqres.in/api/register";
		String requestBody = "{\r\n"
				+ "    \"email\": \"eve.holt@reqres.in\",\r\n"
				+ "    \"password\": \"pistol\"\r\n"
				+ "}";
		Response response = RestAssured.given().contentType("application/json").body(requestBody).post(url);
		System.out.println(response.asString());
	}


		
	
}
