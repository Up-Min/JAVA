package data;

public class Car {
	private double CarSpeed = 1;
	
	Fuel F = new Fuel();
	Tire T = new Tire();
	
	public Car() {
	}	
	
	public double getCarSpeed() {
		return CarSpeed;
	}
	public void setCarSpeed(int carSpeed) {
		CarSpeed = carSpeed;
	}
	public void TireCarSpeed(double carSpeed) {
		CarSpeed = carSpeed;
	}
	public void recoverCarSpeed() {
		CarSpeed = 160;
	}
	
}
