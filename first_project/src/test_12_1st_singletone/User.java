package test_12_1st_singletone;

public class User {
	// User name
	private String name;
	
	public User(String name) {
		this.name = name;
	}
	
	public void print() {
		Printer printer = Printer.getPrinter();
	// return printer object.
		System.out.println(this.name + "사용자가 사용하는 프린트 : " + printer.toString());
		//printer.toString -> return object's address
	}
	
}
