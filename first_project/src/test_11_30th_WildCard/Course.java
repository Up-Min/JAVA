package test_11_30th_WildCard;

public class Course {
	// 1. all person can applicant
	public static void registerCourse1(Applicant<?> applicant) { 
		// add ? in Applicant< ' ' > (use wildcard)
		// whatever type can adapt in registerCourse1
	System.out.println(applicant.kind.getClass().getSimpleName()+"이 Course1을 등록.");
		// get class's name ? -> 
	}

	// 2. only Student can applicant
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		// add ? extends Student in Applicant< ' ' > (use wildcard)
		// only Student, HighStudent, MiddleStudent can use as generic type (child class)
	System.out.println(applicant.kind.getClass().getSimpleName()+"이 Course2를 등록.");	
	}

	// 3. employee & normal person can applicant
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		// add ? super Worker in Applicant< ' ' > (use wildcard)
		// only Worker, Person can use as generic type (Parent class)
		System.out.println(applicant.kind.getClass().getSimpleName()+"이 Course3을 등록.");			
	}
	
	
}
