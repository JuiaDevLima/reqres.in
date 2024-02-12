package api.test.post;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestPostCreate {

	Response response;

	@Test
	public void testPostCreate() {
		
		String url = "https://reqres.in/api/users";
		String requestBody = "{ \\\"name\\\": \\\"morpheus\\\", \\\"job\\\": \\\"leader\\\" }";
		Response response = RestAssured.given().contentType("application/json").body(requestBody).post(url);
		System.out.println(response.asString());
	}

}
