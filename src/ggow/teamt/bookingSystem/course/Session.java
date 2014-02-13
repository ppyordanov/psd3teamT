package ggow.teamt.bookingSystem.course;

import java.sql.Time;

public class Session {

	public String name;
	public Course course; //which course (class) it is part of. Ala this is one session of PSD3
	public Location location;
	public Time startTime;
	public Time endTime;
	public int duration; //in minutes
	
	public Session() {
		name = null;
		course = null;
		location = null;
		startTime = null;
		endTime = null;
		duration = 0;
	}
	
	public Session(String name, Course course, Location location,
			Time startTime, Time endTime, int duration) {
		super();
		this.name = name;
		this.course = course;
		this.location = location;
		this.startTime = startTime;
		this.endTime = endTime;
		this.duration = duration;
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
	
	
}
