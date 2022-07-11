package CRUDOperationsWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UpdateProjectTest {
	
	@Test
	public void updateProject()
	{
		baseURI = "http://localhost";
		port = 8084;
		
		//Step 1: create neceesaary data
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Abhishek");
		jobj.put("projectName", "Xylem");
		jobj.put("status", "On Going");
		jobj.put("teamSize", 15);
		
		//Step 2: send request and validate
		given()
		  .body(jobj)
		  .contentType(ContentType.JSON)
		.when()
		  .put("/projects/TY_PROJ_7012")
		.then()
		  .assertThat().statusCode(200)
		  .log().all();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
