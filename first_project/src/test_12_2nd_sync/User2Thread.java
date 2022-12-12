package test_12_2nd_sync;

public class User2Thread extends Thread{
	// create Calculator object
	private Calculator cal;
	
	// will set thread's name
	public User2Thread() {
		setName("user2Thread"); // change thread name
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
		cal.setMemory2(50);
	}	
}
