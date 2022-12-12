package test_11_29th_interfaceGeneric;

public class GenericEx {

	public static void main(String[] args) {
		HomeAgency HA = new HomeAgency();
		Home H = HA.rent(); // Home H = new Home
		H.turnOnLight();
		
		CarAgency CA = new CarAgency();
		Car C = CA.rent(); // Car C = new Car
		C.run();

	}
}
