package java_modeling_11_29_asso3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class Student {
	//field
	private String name;
// course is useless //	private Vector<Course> courses; 
	
	// request list
	private Vector<Transcript> transcripts;
	
	//Construcor
	public Student(String name) {
		this.name = name;
		transcripts = new Vector<Transcript>();
	}
	
	//add course request from here
	public void addTranscript(Transcript transcript) {
		transcripts.add(transcript);
	}
	
	public void showTranscript() {
		
	}
}
