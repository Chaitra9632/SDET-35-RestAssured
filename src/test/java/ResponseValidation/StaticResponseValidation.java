package ResponseValidation;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

public class StaticResponseValidation {
	
	@Test
	public void staticReponseV()
	{
		baseURI = "http://localhost";
		port = 8084;
		
		String expData = "TY_PROJ_1003";
		//create data
		//send request and validate response
		 Response resp = when()
		                  .get("/projects");
		 
		//validate
		String actData = resp.jsonPath().get("[0].projectId");
		Assert.assertEquals(expData, actData);
		resp.then().log().all();
	}

}
