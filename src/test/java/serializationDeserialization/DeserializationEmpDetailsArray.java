package serializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerializationDeserialization.EmpDetailsWithObject;
import pojoForSerializationDeserialization.Spouse;

public class DeserializationEmpDetailsArray {
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper obj = new ObjectMapper();
		
		 EmpDetailsWithObject e1 = obj.readValue(new File(".\\EmpDetailsObject.json"), EmpDetailsWithObject.class);
		
		 Spouse e2 = obj.readValue(new File(".\\EmpDetailsObject.json"), Spouse.class);
		 
		System.out.println(e1.getDesignation());
		System.out.println(e1.getPhno()[0]);
		
		System.out.println(e2.getSCompany());
		
	}

}
