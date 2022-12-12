package school;

import java.util.ArrayList;
import utils.Define;

public class Subject {
	private String subjectName; 
	private int subjectId; 
	private int gradeType; // check grade
	private ArrayList<Student> studentList = new ArrayList<Student>();
	// student list who requested subject (Each new Subject object has arraylist named Studentlist)
	
	public Subject(String subjectName, int subjectId) {
		this.subjectName = subjectName;
		this.subjectId = subjectId;
		this.gradeType = Define.AB_TYPE; //normally use AB policy
	}
	
	public void register (Student student) {
		studentList.add(student);
	}

	
	//getter, setter
	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public int getGradeType() {
		return gradeType;
	}

	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	
	

	
	
	
}
