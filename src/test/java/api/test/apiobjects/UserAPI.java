package api.test.apiobjects;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class UserAPI {
	
private final String baseURL;
	
	public UserAPI(String baseURL) {
		this.baseURL = baseURL;
	}
	
	public Response getUsers(int page) {
		return RestAssured.get(baseURL + "/api/users?page=" + page);
		
	}
	
	


}
