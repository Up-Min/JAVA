package test_11_24th_object;

public class Student {
	//HashCode
	
	//field
	private int no;
	private String name;
	//constructor
	public Student(int no, String name) {
		this.name = name;
		this.no = no; 
	}	
	//generate getter
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	
	// override hashCode
	@Override
	public int hashCode() {
		int hashCode = no + name.hashCode();
	// on String, if value is same, 
	// bring result from same address
	// if no, name.hashcode is same : generate same hashcode.
	// ex) (1,"AAA"), (1,"AAA") -> same hashcode 
	// ex) (2,"ABA"), (1,"AAA") -> diffrent hashcode 
		return hashCode;
	}
	
	// override equals
	@Override
public boolean equals(Object obj) {
	// obj has student object
	if(obj instanceof Student) {
	Student target = (Student) obj; // Casting
	// number, name(String's equals) compare
	if(no == target.getNo() && name.equals(target.getName())) {
		return true;
		}
	}
	return false;
}	
}
