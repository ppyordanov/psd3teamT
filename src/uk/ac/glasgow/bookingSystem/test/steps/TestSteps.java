package uk.ac.glasgow.bookingSystem.test.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;


import uk.ac.glasgow.bookingSystem.components.course.*;
import uk.ac.glasgow.bookingSystem.components.login.*;
import uk.ac.glasgow.bookingSystem.components.users.*;

public class TestSteps {

	private Student student;
	private Admin admin;
	private Lecturer lecturer;
}
