package com.nagarjuna.principle.liskov_substitution;

public class MathTeacher extends SchoolStaff implements CourseInstructor{

	@Override
	public void teach() {
		System.out.println("Taught Math");
	}

}
