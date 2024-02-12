package api.test.post;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestPostUpdate {

	Response response;

	@Test
	public void testPutUpdate() {

		String url = "https://reqres.in/api/users/2";
		String requestBody = "{ \"name\": \"morpheus\", \"job\": \"zion resident\" }";
		Response response = RestAssured.given().contentType("application/json").body(requestBody).put(url);
		System.out.println(response.asString());
	}

}
