package ggow.teamt.bookingSystem.users;

public class User {
	
	protected String id;
	protected String firstN;
	protected String lastN;
	protected String email;
	
	protected User(String id, String firstN, String lastN, String email){
		
		this.id = id;
		this.firstN = firstN;
		this.lastN = lastN;
		this.email = email;
		
	}

	protected String getId() {
		return id;
	}

	protected void setId(String id) {
		this.id = id;
	}

	protected String getFirstN() {
		return firstN;
	}

	protected void setFirstN(String firstN) {
		this.firstN = firstN;
	}

	protected String getLastN() {
		return lastN;
	}

	protected void setLastN(String lastN) {
		this.lastN = lastN;
	}

	protected String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}

}
