package uk.ac.glasgow.bookingSystem.components.users;


import java.util.LinkedList;

import uk.ac.glasgow.bookingSystem.components.course.Course;
import uk.ac.glasgow.bookingSystem.components.course.Location;
import uk.ac.glasgow.bookingSystem.components.course.Session;
import uk.ac.glasgow.bookingSystem.components.data.Data;

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
	
	public void createCourse(Data d, String name, int classSize, LinkedList<Session> sessions, Lecturer lecturer){
		
		Course newC = new Course(name,classSize,sessions, lecturer);
		//courseList.add(newC);
		d.courses.add(newC);
		//TODO Make this refer to the dataStore class in course Module
	}
	
	public void removeCourse(Data d, Course remC){
		d.courses.remove(remC);
		//courseList.remove(remC);
		//TODO Make this refer to dataStore class in course Module
	}
	
	public void createSession(Course C, Session s){
		
		C.getSessions().add(s);
		
	}
	
	public void allSessionsAvailable(Data d, Course c) {
		System.out.println(d.courses.toString());
	}
	
	public void changeLocation(Session S, Location l){
		
		S.setLocation(l);
	}
	
	public boolean addStudent(Data d, String id, String firstN, String lastN, String email, 
			boolean tutorStatus, LinkedList<Course> courselist) {
		Student student = new Student(id, firstN, lastN, email, tutorStatus, courselist);
		
		if(d.users.add(student)){
			return true;
		} else {
			return false;
		}
	}
	
	public String toString(){
		return "User id: " + this.id + "\nName: " + this.firstN + " " + this.lastN + "\nEmail: " + this.email + "\nUser type: admin" + "\nDepartment: " + this.department; 
	}
	
}
