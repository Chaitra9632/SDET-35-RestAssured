package GenericLibrary;

import io.restassured.response.Response;

/**
 * this class contains generic methods related to rest assured
 * @author Chaitra M
 *
 */
public class RestAssuredLibrary {
	
	/**
	 * This method will accept the jsonpath and return the json data
	 * @param resp
	 * @param path
	 * @return
	 */
	public String getJSONData(Response resp, String path)
	{
		String jsonData = resp.jsonPath().get(path);
		return jsonData;
	}

}
