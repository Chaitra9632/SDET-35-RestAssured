package pojoForSerializationDeserialization;

public class EmpDetailsWithArray
 {
	
	//Declare all variables as glbal
	String name;
	String empId;
	String email;
	int[] phno;
	String designation;
	
	//create a constructor to initialize
	public EmpDetailsWithArray(String name, String empId, String email, int[] phno, String designation) {
		this.name = name;
		this.empId = empId;
		this.email = email;
		this.phno = phno;
		this.designation = designation;
	}

	public EmpDetailsWithArray()
	{
		
	}
	
	//Provide getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int[] getPhno() {
		return phno;
	}

	public void setPhno(int[] phno) {
		this.phno = phno;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	
	

}
