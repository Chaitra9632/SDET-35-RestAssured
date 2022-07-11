package CRUDOperationsWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetAllProjects {
	
	@Test
	public void getAllProjects()
	{
		//Step 1: create required data
		//Step 2: send the request
		Response resp = RestAssured.get("http://localhost:8084/projects");
		
		//Step 3: validate the response
		ValidatableResponse validate = resp.then();
		validate.log().all();
		validate.assertThat().statusCode(200);
	}

}
