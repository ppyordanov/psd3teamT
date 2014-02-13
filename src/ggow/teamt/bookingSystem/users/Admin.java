package ggow.teamt.bookingSystem.users;

import ggow.teamt.bookingSystem.course.Course;
import ggow.teamt.bookingSystem.course.Location;
import ggow.teamt.bookingSystem.course.Session;

import java.util.LinkedList;

public class Admin extends User {
	
	String department;
	
	public Admin(){
		super();
		department = "null";
	}


	public Admin(String id, String firstN, String lastN, String email, String department) {
		
		super(id, firstN, lastN, email);
		
		this.department = department;
		
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void createCourse(String name, int classSize, LinkedList<Session> sessions, Lecturer lecturer){
		
		Course newC = new Course(name,classSize,sessions, lecturer);
		courseList.add(newC);
		
	}
	
	public void removeCourse(Course remC){
		courseList.remove(remC);
	}
	
	public void createSession(Course C, Session s){
		
		C.getSessions().add(s);
		
	}
	
	public void changeLocation(Session S, Location l){
		
		S.setLocation(l);
	}
	
	public String toString(){
		return "User id: " + this.id + "\nName: " + this.firstN + " " + this.lastN + "\nEmail: " + this.email + "\nUser type: admin" + "\nDepartment: " + this.department; 
	}
	
}
