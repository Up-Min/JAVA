package java_modeling_11_29_asso2;

import java.util.Vector;

public class Course {
	// Course's name, field
	private String name;
	private Vector<Student> students;
	
	
	public Course(String name) {
		this.name = name;
		students = new Vector<Student>();
	}
	
	//method (getter)
	public String getName() {
		return name;
	}
	
	// add students who requested Course
	public void addStudent (Student stu) {
		students.add(stu);
	}
		
	// remove students who requested Course
	public void removeStudent (Student stu) {
		students.remove(stu);
	}
	
	// recognize each other

}
