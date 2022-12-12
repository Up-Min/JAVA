package test_11_30th_WildCard;

public class Applicant<T> { 
	public T kind; //declare T
	
	//constructor
	public Applicant(T kind) {
		this.kind = kind;
	}
}
