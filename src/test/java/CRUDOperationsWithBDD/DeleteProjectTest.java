package CRUDOperationsWithBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DeleteProjectTest {
	
	@Test
	public void deleteP()
	{
		baseURI = "http://localhost";
		port = 8084;
		
		when()
		 .delete("/projects/TY_PROJ_7012")
		.then()
		 .assertThat().statusCode(204).log().all();
	}

}
