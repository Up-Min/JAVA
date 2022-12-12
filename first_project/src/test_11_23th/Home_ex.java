package test_11_23th;

public class Home_ex {

	public static void main(String[] args) {
		Home h = new Home();
		h.use1();
		h.use2();
		h.use3(new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("turnOn vaccuum");
			}
			@Override
			public void turnOff() {
				System.out.println("turnOff vaccuum");	
			}
		});
	}

}
