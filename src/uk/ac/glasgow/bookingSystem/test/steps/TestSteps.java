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
	
}
