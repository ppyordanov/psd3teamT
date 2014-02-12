package ggow.teamt.bookingSystem.users;

public class User {

	public String firstName;
	public String lastName;
	public String ID;
	public String userType;
	public boolean isStaff;

	public User(String firstName, String lastName, String ID, String userType, boolean isStaff){
		this.firstName = firstName;
		this.lastName = lastName;
		this.ID = ID;
		this.userType = userType;
		this.isStaff = isStaff;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public boolean isStaff() {
		return isStaff;
	}

	public void setStaff(boolean isStaff) {
		this.isStaff = isStaff;
	}
	
	
}
