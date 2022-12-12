package test_11_18th;

public class Driver {
	// 메소드 구현 (매개변수로 다형성 구현) -  무슨값이 들어올지 모른
	public void drive(Vehicle vehicle) {
		// Vehicle vehicle = new Bus();
		// Vehicle vehicle = new Taxi();
		// Vehicle vehicle = new Vehicle();
		
		vehicle.run(); 
	}
}
