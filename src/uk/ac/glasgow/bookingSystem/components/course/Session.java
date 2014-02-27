package uk.ac.glasgow.bookingSystem.components.course;

import java.sql.Time;
import java.sql.Date;


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
		if (startDate.compareTo(this.endDate)>=0 || this.endDate == null)
			this.startDate = startDate;
		else
			{
			this.startDate = null;
			System.out.println("Start date cannot be after End date! Start date set to Null.");
			}
	}
	
	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) 
		{
		if (endDate.compareTo(this.startDate)<=0 || this.startDate == null)
			this.endDate = endDate;
		else
			{
			this.endDate = null;
			System.out.println("End date cannot be before Start date! End date set to Null.");
			}
		}
	
	public String getFrequency()
		{
		return frequency;
		}
	
	public void setFrequency(String frequency)
		{
		if (frequency == "once" || frequency == "weekly" || frequency == "bi-monthly" ||
			frequency == "monthly" || frequency == "yearly")
			this.frequency = frequency;
		else 
			{
			System.out.println("Not a correct frequency! The correct ones are: once, weekly, bi-monthly, monthly, yearly.");
			System.out.println("Frequency set to Null");
			this.frequency = null;
			}
		}
	
	public Boolean getRequired()
		{
		return required;
		}
	
	public void setRequired(Boolean required)
		{
		this.required = required;
		}
	
	public String toString(){
		
		return "Session: " + this.getName() + "\nCourse: " + this.getCourse() + "\nLocation: " + this.getLocation().getBuildingName()
				+ "\nStart time: " + this.getStartTime() + "\nEnd time: " + this.getEndTime() + "\nDuration: " + this.getDuration()
				+ "\nFrequency: " + this.getFrequency() + "\nStart date: " + this.getStartDate() + "\nEnd date: " + this.getEndDate()
				+ "\nRequired: " + this.getRequired();
		
	}
}
