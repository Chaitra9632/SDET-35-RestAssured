package CRUDOperationsWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateProjectTest {
	
	@Test
	public void createProjectTest()
	{
		//Step 1: Create required data
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Chaitra");
		jobj.put("projectName", "TYSS");
		jobj.put("status","Created");
		jobj.put("teamSize", 12);
		
		//Step 2: send the request
		RequestSpecification req = RestAssured.given();
		req.body(jobj);
		req.contentType(ContentType.JSON);
		Response resp = req.post("http://localhost:8084/addProject");
		
		//Step 3: validate the response
		System.out.println(resp.prettyPeek());
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getTime());
		
		ValidatableResponse validate = resp.then();
		validate.log().all();
		
	}

}
