package uk.ac.glasgow.bookingSystem.components.users;


import java.util.LinkedList;

import uk.ac.glasgow.bookingSystem.components.course.Course;
import uk.ac.glasgow.bookingSystem.components.course.Session;

public class Student extends User{

	protected boolean isTutor;
	protected LinkedList<Course> courseList;
	protected LinkedList<Session> sessionsSignedUp;

	public Student() {
		super();
		isTutor = false;
		courseList = null;
		sessionsSignedUp=0;
	}


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
	
	public LinkedList<Session> getSessionsSignedUp() {
		return sessionsSignedUp;
	}


	public void setSessionsSignedUp(LinkedList<Session> sessionsSignedUp) {
		this.sessionsSignedUp = sessionsSignedUp;
	}
	
	public String checkSessionsSignedUp(){
		
		String checkResult ="";
		
		for(Course c : courseList){
			
			for(Session s: c.getSessions()){
				
				if(s.getRequired()){
					
					if(!this.getSessionsSignedUp().contains(s)){
						
						checkResult += "Not signed up for session: " + s.getName() + "\n" + "Course: " + c.getName();
						
					}
					
				}

			}
		}
		
		return checkResult;
		
	}
	
	public String toString(){
		return "User id: " + this.id + "\nName: " + this.firstN + " " + this.lastN + "\nEmail: " + this.email + "\nUser type: student"; 
	}
	
}
