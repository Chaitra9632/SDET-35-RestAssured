package Authentications;

import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Oauth2Test {
	
	@Test
	public void oauth2Test() 
	{
		baseURI = "http://coop.apps.symfonycasts.com";
		
		//Step 1: create a post request with client id and cleint secret
		Response resp = given()
						.formParam("client_id", "SDET 35")
						.formParam("client_secret", "79808c61fc976c94001537fa45ce34fb")
						.formParam("grant_type", "client_credentials")
						.formParam("redirect_uri", "http://example.com")
						.formParam("code", "authorization_code")
						.when()
						.post("/token");
		
		//Step 2: capture the access token in response
		String token = resp.jsonPath().get("access_token");
		Reporter.log(token,true);
		
		//Step 3: use that access token to access any of the APIs
		given()
		  .auth().oauth2(token)
		  .pathParam("USER_ID", 1914)
		.when()
		  .post("/api/{USER_ID}/barn-unlock")
		.then().log().all();
		
	}

}
