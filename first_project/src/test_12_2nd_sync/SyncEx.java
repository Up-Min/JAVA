package test_12_2nd_sync;

public class SyncEx {

	public static void main(String[] args) {
		//declare Calculator object
		Calculator cal = new Calculator();
		
		User1Thread u1 = new User1Thread();
		u1.setCal(cal);
		u1.start();
		
		User2Thread u2 = new User2Thread();
		u2.setCal(cal);
		u2.start();
	}
	// console result is 50, 50
}
