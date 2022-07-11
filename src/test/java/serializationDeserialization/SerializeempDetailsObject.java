package serializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerializationDeserialization.EmpDetailsWithObject;
import pojoForSerializationDeserialization.Spouse;

public class SerializeempDetailsObject {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		
		int[] arr = {12345,98765};
		Spouse sp = new Spouse("abc", 1234, "Accenture");
		EmpDetailsWithObject emp = new EmpDetailsWithObject("Chaitra", "ty123", "Sr QA",arr, sp);
		
		ObjectMapper obj = new ObjectMapper();
		
		obj.writeValue(new File("./EmpDetailsObject.json"), emp);
	}
}
