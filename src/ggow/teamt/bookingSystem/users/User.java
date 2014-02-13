package ggow.teamt.bookingSystem.users;

public class User {
	
	protected String id;
	protected String firstN;
	protected String lastN;
	protected String email;
	
	public User(String id, String firstN, String lastN, String email){
		
		this.id = id;
		this.firstN = firstN;
		this.lastN = lastN;
		this.email = email;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstN() {
		return firstN;
	}

	public void setFirstN(String firstN) {
		this.firstN = firstN;
	}

	public String getLastN() {
		return lastN;
	}

	public void setLastN(String lastN) {
		this.lastN = lastN;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString(){
		return "User id: " + this.id + "\nName: " + this.firstN + " " + this.lastN + "\nEmail: " + this.email; 
	}

}
