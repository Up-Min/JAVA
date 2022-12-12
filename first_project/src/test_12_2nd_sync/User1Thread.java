package test_12_2nd_sync;

public class User1Thread extends Thread{
	// create Calculator object
	private Calculator cal;
	
	// will set thread's name
	public User1Thread() {
		setName("user1Thread"); // change thread name
	}

	// setter 
	public void setCal(Calculator cal) {
		this.cal = cal;
	}

	//override run
	// when thread starts, activate code.
	@Override
	public void run() {
// change calculator's memory 
		cal.setMemory1(100);
	}	
}
