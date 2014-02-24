package uk.ac.glasgow.bookingSystem.components.course;

import java.util.LinkedList;

public class dataStore {
	public LinkedList<Course> courseList;
	
	public dataStore(){
		courseList = null;
	}
	
	public dataStore(LinkedList<Course> courseList) {
		this.courseList = courseList;
	}

	public LinkedList<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(LinkedList<Course> courseList) {
		this.courseList = courseList;
	}
	
	public void addCourse (Course course) {
		courseList.add(course);
	}
	
	public void removeCourse(Course course) {
		courseList.remove(course);
	}
}
