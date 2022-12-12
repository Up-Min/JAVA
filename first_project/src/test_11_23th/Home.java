package test_11_23th;

public class Home {
	// declare anonymous object on "field"
	private RemoteControl rc = new RemoteControl() {
		// treated as nameless class. 
		@Override
		public void turnOn() {
			System.out.println("turnOn TV");
		}
		@Override
		public void turnOff() {
			System.out.println("turnOff TV");
		}
	}; 
	// make new method
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}
	// "method" (use local variable)
	public void use2() {
		RemoteControl rc = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("turnOn Aircon");
			}
			@Override
			public void turnOff() {
				System.out.println("turnOff Aircon");
			}
		};
		rc.turnOn();
		rc.turnOff();	
	}
	// "method" (use parameter)
	public void use3(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}

}
