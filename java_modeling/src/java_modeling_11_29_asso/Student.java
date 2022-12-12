package java_modeling_11_29_asso;

import java.util.Vector;

public class Student {
	//field
	private String name;
	private Vector<Course> courses; 
// vector -> same as arraylist! 
// Student knows Course.
// don't have idea for quantity of course,
// use Vector(arraylist)
 	
	//Construcor
	public Student(String name) {
		this.name = name;
		courses = new Vector<Course>();
	}
	
	// request course
	public void registerCourse(Course cou) {
		courses.add(cou);
	}
	
	//cancel courser
	public void dropCourse(Course cou) {
		courses.remove(cou);
	}
	
	/*
	 * student knows Course, 
	 * Course doesn't know Student.
	 * course is more than 1.
	 * 
	 */
	
}
