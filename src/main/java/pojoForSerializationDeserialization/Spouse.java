package pojoForSerializationDeserialization;

public class Spouse {
	
	String Sname;
	int SPhone;
	String SCompany;
	
	
	public Spouse(String sname, int sPhone, String sCompany) {
	
		Sname = sname;
		SPhone = sPhone;
		SCompany = sCompany;
	}

	public Spouse()
	{
		
	}

	public String getSname() {
		return Sname;
	}


	public void setSname(String sname) {
		Sname = sname;
	}


	public int getSPhone() {
		return SPhone;
	}


	public void setSPhone(int sPhone) {
		SPhone = sPhone;
	}


	public String getSCompany() {
		return SCompany;
	}


	public void setSCompany(String sCompany) {
		SCompany = sCompany;
	}
	
	
	
	

}
