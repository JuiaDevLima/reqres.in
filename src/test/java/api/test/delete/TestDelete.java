package api.test.delete;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestDelete {
	
	Response response;
	
	@Test
	public void gestTestStatusCode() {
		response = RestAssured.get("https://reqres.in/api/users/2");
		assertEquals(200, response.getStatusCode());

	}
	
	@Test
	public void testDelete() {
		response = RestAssured.get("https://reqres.in/api/users/2");
		assertEquals("To keep ReqRes free, contributions towards server costs are appreciated!", response.jsonPath().getString("support.text"));
		
	}
	

}
