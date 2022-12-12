package java_modeling_11_29_asso3;

import java.util.Vector;

public class Course {
	// Course's name, field
	private String name;
	// Student is useless private Vector<Student> students; // 
	private Vector<Transcript> transcripts;
	
	public Course(String name) {
		this.name = name;
		transcripts = new Vector<Transcript>();
	}
	
	//method (getter)
	public String getName() {
		return name;
	}
	
	//add course request from here
	public void addTranscript(Transcript transcript) {
		transcripts.add(transcript);
	}
	

}
