package aplication;

import grade.MajorEvaluation;
import school.School;
import school.Score;
import school.Student;
import school.Subject;
import school.report.GenerateGradeReport;
import utils.Define;

public class StudentinfoApplication {

	School goodSchool = School.getInstance();
	Subject korean;
	Subject math;
	GenerateGradeReport gradeReport = new GenerateGradeReport();
	
	public static void main(String[] args) {
			StudentinfoApplication test = new StudentinfoApplication();
			
			test.createSubject();
			test.createStudent();
			
			String report = test.gradeReport.getReport();
			System.out.println(report);
			
/*code review : (c.GenerateGradeReport) has 3 static final field, StringBuffer
 * if, activate getReport
 *  1. Declares Array from subjectList from (c.School) -> (main) line 42,43
 *   subjectList has 
 *   subject1 : "국어", Define.KOREA, AB_TYPE, subject, point
 *   subject2 : "수학", Define.MATH, AB_TYPE, subject, point
 *   
 *  2. subjectList has 2 member(korean, math) -> do 2times 'for' setence
 *   2.1 makeHeader(subject)
 *    use static final field(Line) + each subject's name + static final field(Line)
 *   
 *   2.2 makeBody(subject)
 *    korean, math has student 5 INFO (name, id, majorsubject, subject, point)
 *    Declare new Array studentlist using each subject's getStudentList
 *    studentsize is 5 (Declared 5 people , saved Studentlist is 5 people)
 *    for 5times, return each Student's name, id, majorsubjectname, method getScoreGrade
 *     
 *     2.2.1 method getScoreGrade(student, subject.getSubjectId())
 *     declare new scorelist from scorelist (c.Student's student.getStudentId(), subject, point)
 *     set (int) majorID from (c.student) Majorsubject object
 *     declare gradeEvaluation[] to use array index by select basic/Major Evaluation
 *     
 *     while scorelist has data (is 2 -> math, korean) 
 *      set score value from each scorelist data
 *       if subject id is same with subjectID from getScoreGrade(subject.getSubjectId())
 *       declare grade to save point
 *       activate checking major subject grade
 *       (c.Define) AB_TYPE declared = 0 / SAB_TYPE declared = 1
 *        if scorelist's subject id is same with majorId -> adapt 1 in gradeEvaluation[]
 *        -> gradeEvaluation[1]-> adapt score.getPoint() in MajorEvaluation (by interface)
 *        
 *        if 2. scorelist's subject id NOT is same with majorId -> adapt 0 in gradeEvaluation[]
 *        -> gradeEvaluation[0]-> adapt score.getPoint() in BasicEvaluation (by interface)
 *        (whether how subjectId) (c.MajorEvaluation or c.BasicEvaluation) return grade
 *        -> saved (c.GenerateGradeReport) grade (String declared) 
 *        
 *        buffer append score's point, grade defined before (c.Evaluation -> c.GenerateGradeReport)
 *     
 *     buffer append (+=) \n, line.
 *     
 *   2.3 makeFooter
 * 		 buffer append (+=) \n, line.
 * 
 *  3.return StringBuffer Buffer as String
 */
			
	}
	
	//createSubject
	public void createSubject() {
		korean = new Subject("국어", Define.KOREA);
		math = new Subject("수학", Define.MATH);
		// code review : (c.school) declare new subject (korean, math - as final static Integer)
		 // this saves subjectname, subjectId, subject check policy to each subject
		
		// input subject
		goodSchool.addSubject(korean);
		goodSchool.addSubject(math);
		// code review: 
		// (c. school) one School, each unique subject, add korean, math in subject list 
		
	}
	
	
	//createStudent
	public void createStudent() {
		//createStudent
		Student student1 = new Student(181213,"박지은",korean);
		Student student2 = new Student(181518,"PARK",math);
		Student student3 = new Student(171230,"LEE",korean);
		Student student4 = new Student(171255,"LIM",korean);
		Student student5 = new Student(171590,"KIM",math);
		//code review : (c.school) each student has unique student info.
		// each info saved in (c.student) -> cons Student (by private)
		
		//add to school
		goodSchool.addStudent(student1);		
		goodSchool.addStudent(student2);		
		goodSchool.addStudent(student3);		
		goodSchool.addStudent(student4);		
		goodSchool.addStudent(student5);	
		//code review : (c.school) has unique studentList array. input student info
		// in studentList array (this means add to school)
		
		
		// subject register.
		korean.register(student1);
		korean.register(student2);
		korean.register(student3);
		korean.register(student4);
		korean.register(student5);

		math.register(student1);
		math.register(student2);
		math.register(student3);
		math.register(student4);
		math.register(student5);
		
		//code review : Declared 2 Subject (korean, math - at line 36, 37)
		// through subject korean, math. save each student info at (c.Subject) array
		
		addScoreForStudent(student1, korean, 95);
		addScoreForStudent(student1, math, 56);
		
		addScoreForStudent(student2, korean, 95);
		addScoreForStudent(student2, math, 95);
		
		addScoreForStudent(student3, korean, 100);
		addScoreForStudent(student3, math, 88);
		
		addScoreForStudent(student4, korean, 89);
		addScoreForStudent(student4, math, 95);
		
		addScoreForStudent(student5, korean, 85);
		addScoreForStudent(student5, math, 56);
		
		/* code review : each student has korean, math point.
		 * use addScoreForStudent, save (c.Score)'s private field(studentId, subject, point)
		 * then, activate (c.Student)'s addSubjectScore to save 
		 * saved (c.Score)'s private field before (line 97)
		 * 
		 * eventually each Student has 5 info
		 * (sId, sName, majorSub, subject, point)
		 */
		
		
	}
	
	//add each student subject's (math, korean) number
	public void addScoreForStudent(Student student, Subject subject, int point) {
		Score score = new Score(student.getStudentId(), subject, point);
		
		// do add Score -> put student.addSubjectScore(score)
		student.addSubjectScore(score);
	}
	
}
