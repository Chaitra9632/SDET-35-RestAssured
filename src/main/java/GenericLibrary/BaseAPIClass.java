package GenericLibrary;

import java.sql.SQLException;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import static io.restassured.RestAssured.*;

/**
 * This is the base class where all API testscripts extend from 
 * @author Chaitra M
 *
 */
public class BaseAPIClass {
	
	public DatabaseLibrary dLib = new DatabaseLibrary();
	public JavaLibrary jLib = new JavaLibrary();
	public RestAssuredLibrary rLib = new RestAssuredLibrary();

	@BeforeSuite
	public void bsConfig() throws SQLException
	{
		dLib.connectToDB();
		Reporter.log("---db connection successful---",true);
		
		baseURI = "http://localhost";
		port = 8084;
	}
	
	
	
	@AfterSuite
	public void asConfig() throws SQLException
	{
		dLib.closeDB();
		Reporter.log("---db connection closed successfully---",true);
	}
}
