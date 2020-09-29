package com.vijay;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	private int id;
	private String name;
	private int marks;
	private List Course;
	private Set StudentName;
	private Map<String,String> CourseRegistration;

	public Map<String, String> getCourseRegistration() {
		return CourseRegistration;
	}

	public void setCourseRegistration(Map<String, String> courseRegistration) {
		CourseRegistration = courseRegistration;
	}

	public Set getStudentName() {
		return StudentName;
	}

	public void setStudentName(Set studentName) {
		StudentName = studentName;
	}

	public List getCourse() {
		return Course;
	}

	public void setCourse(List course) {
		Course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}
