package test_11_28th;

public class CastingExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		vehicle.run();
		
		Bus b = (Bus)vehicle;
		b.checkfare();
		
	}
}
