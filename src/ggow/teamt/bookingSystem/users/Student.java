package ggow.teamt.bookingSystem.users;

import ggow.teamt.bookingSystem.course.Course;

import java.util.LinkedList;

public class Student extends User{

	protected boolean isTutor;
	protected LinkedList<Course> courseList;
	
	public Student(String id, String firstN, String lastN, String email, boolean isTutor, LinkedList<Course> courseList) {
		
		super(id, firstN, lastN, email);
		
		this.isTutor = isTutor;
		this.courseList = courseList;
		
	}

	public boolean isTutor() {
		return isTutor;
	}

	public void setTutor(boolean isTutor) {
		this.isTutor = isTutor;
	}

	public LinkedList<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(LinkedList<Course> courseList) {
		this.courseList = courseList;
	}
	
	public String toString(){
		return "User id: " + this.id + "\nName: " + this.firstN + " " + this.lastN + "\nEmail: " + this.email + "\nUser type: student"; 
	}
	
}
