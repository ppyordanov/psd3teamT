package uk.ac.glasgow.bookingSystem.components.course;


import java.util.LinkedList;

import uk.ac.glasgow.bookingSystem.components.users.Lecturer;

public class Course {

	protected String name;
	protected int classSize;
	protected LinkedList<Session> sessions;
	protected Lecturer lecturer;
	
	public Course() {
		name = null;
		classSize = 0;
		sessions = null;
		lecturer = null;
	}
	
	public Course(String name, int classSize, LinkedList<Session> sessions, Lecturer lecturer){
		this.name = name;
		this.classSize = classSize;
		this.lecturer = lecturer;
		this.sessions = sessions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void AddSessionToCourse(Session s){
		
		LinkedList<Session> temp = this.getSessions();
		temp.add(s);
		this.setSessions(temp);
		
	}

	public LinkedList<Session> getSessions() {
		return sessions;
	}

	public void setSessions(LinkedList<Session> sessions) {
		this.sessions = sessions;
	}

	public Lecturer getLecturer() {
		return lecturer;
	}

	public void setLecturer(Lecturer lecturer) {
		this.lecturer = lecturer;
	}

	public int getClassSize() {
		return classSize;
	}

	public void setClassSize(int classSize) {
		this.classSize = classSize;
	}
	
	public String viewAllSessions(){
		
		return this.toString();
		
	}
	
	public String toString(){
		
		return "Course name: " + this.getName() + "\nClass size: " + this.getClassSize() + "\nLecturer: "
				+ this.getLecturer() + "\nSessions: " + this.getSessions().toString();
		
	}
	
}
