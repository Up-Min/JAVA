package test_11_30th_WildCard;

public class Generic_Ex {
	public static void main(String[] args) {
	// 1. all person applicants
		Course.registerCourse1(new Applicant<Person>(new Person())); 
		// new Applicant<Person>(new Person()) type <person> put new Person object.
		Course.registerCourse1(new Applicant<Worker>(new Worker())); 
		Course.registerCourse1(new Applicant<Student>(new Student())); 
		Course.registerCourse1(new Applicant<HighStudent>(new HighStudent())); 
		Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent())); 
		// registerCourse1 dosen't care about who apply. <?>
		
		// generate registerCourse1 -> need Applicant Parameter 
		// (Course) as (Applicant<?> applicant = new Applicant<Person>(new Person())
		// (Applicant) type Person, recieve Person object (T kind -> Person person)
		// (Course) applicant.kind is person
		
	// 2. only Student applicants
//		Course.registerCourse2(new Applicant<Person>(new Person())); 
//		Course.registerCourse2(new Applicant<Worker>(new Worker())); 
		Course.registerCourse2(new Applicant<Student>(new Student())); 
		Course.registerCourse2(new Applicant<HighStudent>(new HighStudent())); 
		Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent())); 
		// registerCourse2 has error on Person, Worker -> <? extends Student>
		
	// 3. employee & normal person applicants
		Course.registerCourse3(new Applicant<Person>(new Person())); 
		Course.registerCourse3(new Applicant<Worker>(new Worker())); 
//		Course.registerCourse3(new Applicant<Student>(new Student())); 
//		Course.registerCourse3(new Applicant<HighStudent>(new HighStudent())); 
//		Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent())); 
// registerCourse3 has an error on Student, HighStudent, MiddleStudent -> <? super Worker>
		
		
	}
}
