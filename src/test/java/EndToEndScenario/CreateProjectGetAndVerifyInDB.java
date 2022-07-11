package EndToEndScenario;

import org.testng.annotations.Test;

import GenericLibrary.BaseAPIClass;
import GenericLibrary.EndPointsLibrary;
import ProjectLibrary.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.sql.SQLException;

public class CreateProjectGetAndVerifyInDB extends BaseAPIClass{
	
	@Test
	public void createP() throws SQLException 
	{
		//Step 1: create project using post()
		ProjectLibrary pLib = new ProjectLibrary("Chaitra", "RMG-"+jLib.getRandomNumber(), "Created", 12);
		
		Response resp = given()
						.body(pLib)
						.contentType(ContentType.JSON)
						.when()
						.post(EndPointsLibrary.CreateProject);
		
		
		//step 2: capture the project id from response
		String proId = rLib.getJSONData(resp, "projectId");
		System.out.println(proId);
		
		//Step 3: use it in get request
		given()
		  .pathParam("pid", proId)
		.when()
		  .get(EndPointsLibrary.GetSingleProject)
		.then().log().all();
		
		
		//Step 4: verify it in database
		String query = "select * from project";
		String data = dLib.executeQueryAndReturnData(query, 1, proId);
		System.out.println(data);
		
	}

}
