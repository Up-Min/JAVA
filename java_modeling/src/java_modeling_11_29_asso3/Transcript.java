package java_modeling_11_29_asso3;

public class Transcript {
	// attribute by relative
	private Student student;
	private Course course;

	// Transcript self attribute
	private String date; // date announce
	private String grade; // point

	public Transcript(Student student, Course course) {
		this.student = student;
		this.course = course;
		// run addTranscript(by received data 
		// Student student,Course course)
		// this -> give transcript object.
		this.student.addTranscript(this);
		this.course.addTranscript(this);
		
		// by running Transcript coustructor.
		// student, course is adding this to Transcript
	}

	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

}
