package com.nagarjuna.principle.liskov_substitution;

public class ScienceTeacher extends SchoolStaff implements CourseInstructor{

	@Override
	public void teach() {
		System.out.println("taught science");
	}
	
}
