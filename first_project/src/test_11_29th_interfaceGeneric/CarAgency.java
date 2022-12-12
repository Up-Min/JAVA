package test_11_29th_interfaceGeneric;

public class CarAgency implements Rentable<Car>{  //change <P> in to <''> want to adapt

	@Override
	public Car rent() {
		return new Car(); // return Home object
	}

}
