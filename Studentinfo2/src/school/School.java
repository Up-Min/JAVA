package school;

import java.util.ArrayList;

public class School {
	//use singletone, because school is ONLY ONE.
	
	// declare school object inside
	private static School instance = new School();
	private static String SCHOOL_NAME = "Good School"; // school name 
	private ArrayList<Student> studentList = new ArrayList<>(); // school's student
	private ArrayList<Subject> subjectList = new ArrayList<>(); // school's subject
	
	// singletone constructor is private
	private School() {}

	// declare singletone method : return school object.
	public static School getInstance() {
		if(instance == null) {
			instance = new School();
		}
		return instance;
	}
	
	// admission School
	public void addStudent(Student student) {
		studentList.add(student);
	}

	// return student list
	public ArrayList<Student> getStudentList() {
		return studentList;
	}
	
	//create subject
	public void addSubject(Subject subject) {
		subjectList.add(subject);
		}
	
	//return subject list
	public ArrayList<Subject> getSubject(){
		return subjectList;
	}
	
	
} 
