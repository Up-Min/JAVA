package data;

public class Car {
	private static double CarSpeed = 100;
	
	public Car() {
	}	
	
	public double getCarSpeed() {
		return CarSpeed;
	}
	public static void setCarSpeed(int carSpeed) {
		CarSpeed = carSpeed;
	}
	public static void TireCarSpeed(double carSpeed) {
		CarSpeed = carSpeed;
	}
	public static void recoverCarSpeed() {
		CarSpeed = 160;
	}
	
}
