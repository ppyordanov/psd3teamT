package ggow.teamt.bookingSystem.course;

import ggow.teamt.bookingSystem.course.Course;
import ggow.teamt.bookingSystem.users.Lecturer;

import java.util.LinkedList;

public class Import 
	{
	protected String name;
	protected int classSize;
	protected LinkedList<Session> sessions;
	protected Lecturer lecturer;
	protected Course course;
	
	public Import(String name, int classSize, LinkedList<Session> sessions, Lecturer lecturer, Course course)
		{
		course.name = course.name;
		course.classSize = classSize;
		course.lecturer = lecturer;
		course.sessions = sessions;
		}
	}
