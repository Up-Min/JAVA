package test_12_1st_singletone;

// THE ONLY one object printer
public class Printer {
	// 2. private Declare Field
	private static Printer printer = null;
	
	private Printer() {
	// SINGLETONE HOW TO USE
	// 1. change public -> private	
	}
	
	//3. create method
	public static Printer getPrinter() {
		if(printer == null) {
			printer = new Printer();
		}
		return printer;
// if, printer is null, create new Printer object
// if, !null, (as Printer Declared) return created Printer object
	}

}
