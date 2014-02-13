package ggow.teamt.bookingSystem.users;

public class Admin extends User {
	
	String department;

	protected Admin(String id, String firstN, String lastN, String email, String department) {
		
		super(id, firstN, lastN, email);
		
		this.department = department;
		
	}

	protected String getDepartment() {
		return department;
	}

	protected void setDepartment(String department) {
		this.department = department;
	}

}
