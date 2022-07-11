package Authentications;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class BearerToken {
	
	@Test
	public void bearerTokenTest()
	{
		baseURI = "https://api.github.com";
		
		JSONObject jobj = new JSONObject();
		jobj.put("name", "SDET35-RESTAssured");
		jobj.put("description", "RestFulWeb services FW tested");
		
		given()
		  .auth()
		  .oauth2("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")
		  .body(jobj)
		  .contentType(ContentType.JSON)
		.when()
		  .post("/user/repos")
		.then()
		  .assertThat().statusCode(201)
		  .log().all();
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		 
	}

}
