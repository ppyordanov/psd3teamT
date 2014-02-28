package uk.ac.glasgow.bookingSystem.test.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.LinkedList;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;




import uk.ac.glasgow.bookingSystem.components.course.*;
import uk.ac.glasgow.bookingSystem.components.data.Data;
import uk.ac.glasgow.bookingSystem.components.login.*;
import uk.ac.glasgow.bookingSystem.components.users.*;

public class TestSteps {

	private Student student;
	private Admin admin;
	private Lecturer lecturer;
	
	private Course course;
	private Location location;
	private Session session;
	
	
	@Given("a student")
	public void aStudent() {
		this.student = new Student();
	}
	
	@Given("an admin")
	public void anAdmin() {
		this.admin = new Admin();
	}
	
	@Given("a lecturer")
	public void aLecturer() {
		this.lecturer = new Lecturer();
	}
	
	@When("create a student:$id, $firstN, $lastN, $email, $tutorStatus, $courselist")
	public void createAStudent(Data d, String id, String firstN, String lastN, String email, boolean tutorStatus, LinkedList<Course> courselist){
		boolean result = admin.addStudent(d, id, firstN, lastN, email, tutorStatus, courselist);
		
		assertThat(result, equalTo(true));
	}
	
	
	@When("add sessions to course: session $s, course $c")
	public void AddSession(Session s){
		boolean expected = course.AddSessionToCourse(s);
		boolean actual = course.existsSession(s);
		
		assertThat(actual, equalTo(expected);
	}
	
	@When("a student signs up for a course and need to check book req. sessions: student $s, session $sess")
	public void checkSessions(Student s,Session sess){
		String expected = "";
		String actual = s.checkSessionsSignedUp(); 
		
		assertThat(actual, equalTo(expected);
	}
	
	@When("student needs to book. sessions: student $s, session $sess")
	public void bookSession(Student s,Session sess){
		boolean expected = true;
		boolean actual = s.setSessionsSignedUp(s.getSessionsSignedUp().add(sess)); 
		
		assertThat(actual, equalTo(expected);
	}
	
	@When("admin needs new timeslot for course: course &c, session $sess")
	public void addTimeSlot(Course s,Session sess){
		boolean expected = true;
		boolean actual = admin.createSession(s, s); 
		
		assertThat(actual, equalTo(expected);
	}
	
	@When("admin needs to change timeslot location: location &l, session $sess")
	public void reviewTimeSlot(Location l,Session sess){
		boolean expected = true;
		boolean actual = admin.changeLocation(sess, l);
		
		assertThat(actual, equalTo(expected);
	}
	
}
