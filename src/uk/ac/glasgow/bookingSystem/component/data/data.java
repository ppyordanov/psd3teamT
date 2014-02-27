package uk.ac.glasgow.bookingSystem.component.data;
import uk.ac.glasgow.bookingSystem.components.course.*;
import uk.ac.glasgow.bookingSystem.components.users.*;

public class data {
	public ArrayList<Course> courses;
	public ArrayList<User> users;
	
	public data() {
		courses = new ArrayList<Course>();
		users = new ArrayList<User>();
		
		users.add(new Admin);
	}
	
	public data(ArrayList<Course> courses) {
		this.courses = courses;
	}

	public ArrayList<Course> getcourses() {
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
