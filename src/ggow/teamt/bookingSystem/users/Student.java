package ggow.teamt.bookingSystem.users;

import java.util.LinkedList;

public class Student extends User{

	protected boolean isTutor;
	protected LinkedList<String> courseList;
	
	protected Student(String id, String firstN, String lastN, String email, boolean isTutor, LinkedList<String> courseList) {
		
		super(id, firstN, lastN, email);
		
		this.isTutor = isTutor;
		this.courseList = courseList;
		
	}

	protected boolean isTutor() {
		return isTutor;
	}

	protected void setTutor(boolean isTutor) {
		this.isTutor = isTutor;
	}

	protected LinkedList<String> getCourseList() {
		return courseList;
	}

	protected void setCourseList(LinkedList<String> courseList) {
		this.courseList = courseList;
	}
	
}
