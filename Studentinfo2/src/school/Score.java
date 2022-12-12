package school;

// some student's subject's score?
public class Score {
	private int studentId;
	private Subject subject;
	private int point;
	
	public Score(int studentId, Subject subject, int point) {
		this.studentId = studentId;
		this.subject = subject;
		this.point = point;
	}


	//override toString, return info about score object's sID, subject, point 
	@Override
	public String toString() {
		return "학번 : " + this.studentId + "," + subject.getSubjectName() + "," + point;
	}


	
	// generate getter, setter
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public Subject getSubject() {
		return subject;
	}


	public void setSubject(Subject subject) {
		this.subject = subject;
	}


	public int getPoint() {
		return point;
	}


	public void setPoint(int point) {
		this.point = point;
	}
	
	
	
	
}
