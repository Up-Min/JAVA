package bank_exception;

//make 'user defined Exception', customize exception
// basic setup
public class InsuffException extends Exception{
	
	public InsuffException() {
	}
	public InsuffException(String message) { 
	// to receive message from where exception declared.
		super(message);
	}
}
