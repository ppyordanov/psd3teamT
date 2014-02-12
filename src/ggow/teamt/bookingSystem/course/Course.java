package ggow.teamt.bookingSystem.course;

public class Course {

	public String name;
	public int classSize;
	
	public Course(String name, int classSize){
		this.name = name;
		this.classSize = classSize;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getClassSize() {
		return classSize;
	}

	public void setClassSize(int classSize) {
		this.classSize = classSize;
	}
	
}
