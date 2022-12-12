package school.report;

import java.util.ArrayList;

import grade.BasicEvaluation;
import grade.GradeEvaluation;
import grade.MajorEvaluation;
import school.*;
import utils.Define;

public class GenerateGradeReport {
	// using string buffer -> to do String's calculate

	// field
	School school = School.getInstance(); // create school singletone object

	public static final String TITLE = " 수강생 학점 \t\t\n ";
	public static final String HEADER = "이름 | 학번 | 필수과목 | 점수      \n";
	public static final String LINE = "====================================== \n";
	private StringBuffer buffer = new StringBuffer(); // same as String buffer = "";

	// MIX grade result's header, body, footer
	public String getReport() {
		ArrayList<Subject> subjectList = school.getSubject();
		for (Subject subject : subjectList) { //subject list has korean, math -> do 2times
			makeHeader(subject);
			makeBody(subject);
			makeFooter();
		}

		return buffer.toString();
		// return (change buffer's data to String)

	}

	// create header
	public void makeHeader(Subject subject) {
		buffer.append(GenerateGradeReport.LINE);
		buffer.append("\t" + subject.getSubjectName()); // to get subject name ""
		buffer.append(GenerateGradeReport.TITLE);
		buffer.append(GenerateGradeReport.HEADER);
		buffer.append(GenerateGradeReport.LINE);
	}

	// create body
	public void makeBody(Subject subject) {
		// 1. needs student list, call subject student list
		ArrayList<Student> studentList = subject.getStudentList();

		for (int i = 0; i < studentList.size(); i++) { // studentList.size is 5
			Student student = studentList.get(i);
			buffer.append(student.getStudentName());
			buffer.append(" | ");
			buffer.append(student.getStudentId());
			buffer.append(" | ");
			buffer.append(student.getMajorSubject().getSubjectName() + "\t");
			// subject object's get getSubjectName
			buffer.append(" | ");

			// studen's subject point, grade calculate.
			getScoreGrade(student, subject.getSubjectId());

			buffer.append("\n");
			buffer.append(LINE);
		}
	}

	// method get student's score, grade
	public void getScoreGrade(Student student, int subjectId) {
		// student's score list (korean, math)
		ArrayList<Score> scoreList = student.getScoreList();

		// Major subject code
		int majorId = student.getMajorSubject().getSubjectId(); 
		// SubjectId in Majorsubject object

		// GradeEvaluation gradeEvaluation = new MajorEvaluation();
		// GradeEvaluation gradeEvaluation1 = new BasicEvaluation();
		// will put array at once.
		GradeEvaluation[] gradeEvaluation = {new BasicEvaluation(), new MajorEvaluation()};

		// use array index to reach Evaluation

		for (int i = 0; i < scoreList.size(); i++) {
			Score score = scoreList.get(i); // get subject's score.
			int chk = score.getSubject().getSubjectId(); // Declare subject id (original to compare)

			if (chk == subjectId) {
				// check equals subjectId. 'return subject(getSubject()) -> get subject code.'
				String grade; // score

				// return Major subject's grade
				if (chk == majorId) {
					// why? essential subject has different grade table
					grade = gradeEvaluation[Define.SAB_TYPE].getGrade(score.getPoint());
					// add index at []. if 0 -> will activate basicEval / if 1 -> will activate MajorEval (line 81)

					// return normal subject's grade
				} else {
					grade = gradeEvaluation[Define.AB_TYPE].getGrade(score.getPoint());
				}

				buffer.append(score.getPoint());
				buffer.append(":");
				buffer.append(grade);
				buffer.append(" | ");
			}
		}
	}

	public void makeFooter() {
		buffer.append("\n"); // buffer += "\n"
	}

}
