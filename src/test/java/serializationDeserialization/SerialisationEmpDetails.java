package serializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerializationDeserialization.EmployeeDetails;

public class SerialisationEmpDetails {
	
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		//Step 1: Create object of pojo class and initialise
		EmployeeDetails emp = new EmployeeDetails("Chaitra", "ty123", "chaitra@ty.com", 12345, "Sr QA");
		
		//Step 2: Create object of Object Mapper class
		ObjectMapper obj = new ObjectMapper();
		
		//Step 3: from object mapper call the method writeValue()
		 obj.writeValue(new File("./EmpDetails.json"), emp);
	}

}
