package ggow.teamt.bookingSystem.users;

import java.util.LinkedList;

public class Lecturer extends User{
	
	protected int phoneN;
	protected String office;
	protected LinkedList<String> coursesT;
	
	boolean isAdvisor;
	
	protected Lecturer() {
		super();
		phoneN = 0;
		office = null;
		coursesT = null;
		
	}

	protected Lecturer(String id, String firstN, String lastN, String email, int phoneN, String office, LinkedList<String> coursesT, boolean isAdvisor) {
		
		super(id, firstN, lastN, email);
		
		this.phoneN = phoneN;
		this.office = office;
		this.coursesT = coursesT;
		this.isAdvisor = isAdvisor;
		
	}

	protected boolean isAdvisor() {
		return isAdvisor;
	}

	protected void setAdvisor(boolean isAdvisor) {
		this.isAdvisor = isAdvisor;
	}

	protected int getPhoneN() {
		return phoneN;
	}

	protected void setPhoneN(int phoneN) {
		this.phoneN = phoneN;
	}

	protected String getOffice() {
		return office;
	}

	protected void setOffice(String office) {
		this.office = office;
	}

	protected LinkedList<String> getCoursesT() {
		return coursesT;
	}

	protected void setCoursesT(LinkedList<String> coursesT) {
		this.coursesT = coursesT;
	}
	
	

}
