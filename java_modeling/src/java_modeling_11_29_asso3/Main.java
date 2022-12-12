package java_modeling_11_29_asso3;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		//create student
		Student s1 = new Student("LEE");
		Student s2 = new Student("KIM");

		//create subject
		Course jv = new Course("java");
		Course dp = new Course("Disign Pattern");
		
		// request course
		Transcript t1 = new Transcript(s1, dp); // Lee request dp
		Transcript t2 = new Transcript(s1, jv); // Lee request jv
		Transcript t3 = new Transcript(s2, dp); // KIM request dp
		
		t1.setDate("2022");
		t1.setGrade("B0"); // Lee's 2022year dp grade is B0
		
		t2.setDate("2022");
		t2.setGrade("A+"); // Lee's 2022year jv grade is A+
		
		t3.setDate("2023");
		t3.setGrade("C"); //Kim's 2023year dp grade is C
		
		System.out.println(t1.getGrade());
		System.out.println(t1.getDate());
		s1.showTranscript();
		
	}

}
