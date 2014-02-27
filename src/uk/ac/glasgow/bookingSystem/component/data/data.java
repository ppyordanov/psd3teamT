package uk.ac.glasgow.bookingSystem.component.data;
import java.util.LinkedList;

import uk.ac.glasgow.bookingSystem.components.course.*;
import uk.ac.glasgow.bookingSystem.components.users.*;

public class data {
	public LinkedList<Course> courses;
	public LinkedList<User> users;
	
	public data() {
		courses = new LinkedList<Course>();
		users = new LinkedList<User>();
		
		users.add(new Admin());
	}
	
	public data(LinkedList<Course> courses) {
		this.courses = courses;
	}

	public LinkedList<Course> getcourses() {
		return courses;
	}
	
	//Admin class holds controls for adding/removing users and courses.
	
	public boolean saveToJSON() {
		//save everything to a JSON file
		return true;
	}
	
	public boolean readFromJSON() {
		//read pre-existing data from JSON
		return true;
	}
}
