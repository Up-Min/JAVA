package java_modeling_11_29_asso2;

import java.util.Vector;

public class Student {
	//field
	private String name;
	private Vector<Course> courses; 
 	
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
	
	
	// recognize each other
	
	
}
