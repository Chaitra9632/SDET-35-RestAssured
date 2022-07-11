package serializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerializationDeserialization.EmpDetailsWithArray;

public class SerializationEmpDetailsArray {
	
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		int[] arr = {123456,98765};
		EmpDetailsWithArray emp = new EmpDetailsWithArray("Chaitra", "ty123", "ch@ty.com", arr, "Sr QA");
		
		ObjectMapper obj = new ObjectMapper();
		
		obj.writeValue(new File("./EmpDetailsWithArray.json"), emp);
	}

}
