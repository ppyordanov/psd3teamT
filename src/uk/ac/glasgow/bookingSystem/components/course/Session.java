package uk.ac.glasgow.bookingSystem.components.course;

import java.sql.Time;
import java.sql.Date;
/*
Need to add following attributes:

    array of all sessions

Also error checking when setting these.

A method to getAllDates() and fill out the array for the session.
*/


public class Session {

	public String name;
	public Course course; //which course (class) it is part of. Ala this is one session of PSD3
	public Location location;
	public Time startTime;
	public Time endTime;
	public int duration; //in minutes
	public String frequency;//once, weekly, bi-monthly, monthly, yearly
	public Date startDate;
	public Date endDate;
	public Boolean required;//is this course required? (true for Yes or false for No)
	
	
	public Session() {
		name = null;
		course = null;
		location = null;
		startTime = null;
		endTime = null;
		duration = 0;
		frequency = null;
		startDate = null;
		endDate = null;
		required = null;
	}
	
	public Session(String name, Course course, Location location,
			Time startTime, Time endTime, int duration, String frequency, Date startDate, Date endDate, Boolean required) {
		super();
		this.name = name;
		this.course = course;
		this.location = location;
		this.startTime = startTime;
		this.endTime = endTime;
		this.duration = duration;
		this.frequency = frequency;
		this.startDate = startDate;
		this.endDate = endDate;
		this.required = required;		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Time getEndTime() {
		return endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
}
