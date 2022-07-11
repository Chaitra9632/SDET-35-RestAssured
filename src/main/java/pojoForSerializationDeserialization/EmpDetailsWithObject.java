package pojoForSerializationDeserialization;

public class EmpDetailsWithObject {
	
	//Declare Variables globally
	String name;
	String empId;
	String Designation;
	int[] phno;
	Object Spouse;
	
	
	public EmpDetailsWithObject(String name, String empId, String designation, int[] phno, Object spouse) {
		this.name = name;
		this.empId = empId;
		this.Designation = designation;
		this.phno = phno;
		this.Spouse = spouse;
	}

	public EmpDetailsWithObject()
	{
		
	}

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


	public String getDesignation() {
		return Designation;
	}


	public void setDesignation(String designation) {
		Designation = designation;
	}


	public int[] getPhno() {
		return phno;
	}


	public void setPhno(int[] phno) {
		this.phno = phno;
	}


	public Object getSpouse() {
		return Spouse;
	}


	public void setSpouse(Object spouse) {
		Spouse = spouse;
	}
	
	

}
