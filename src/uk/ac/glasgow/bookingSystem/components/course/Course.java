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
	
	public String toString(){
		String info = "Course name: " + this.name + "\nClass size: " + this.classSize + "\nSessions: " + this.sessions.toString() + "\nLecturer: " + this.lecturer;
		return info;
	}
	
}
