package test_11_23th;

public class Car {
	// Tire object declare on field
	private Tire tire1 = new Tire();
	private Tire tire2 = new Tire() { // add {}
		// tire2 is on Tire's child object naturally.
		// + as nameless class.
		// + auto type conversion
		// override roll()
		@Override
		public void roll() { // -> as nameless class
			System.out.println("roll hankook tire");
		}
	};
	
	//method (as field)
	public void run() {
		tire1.roll();
		tire2.roll();
	}
	
	// anonymous child object in local variable.
	public void run2() {
		Tire tire = new Tire() {
			//nameless class + inheritance + auto type conversion
			@Override
			public void roll() {
				System.out.println("roll kumho tire");
			}
		};
		tire.roll();
	}
	// method (use parameter)
	public void run3(Tire tire) {
		tire.roll();
	}
}
