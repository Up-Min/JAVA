package test_11_29th_interfaceGeneric;

public class HomeAgency implements Rentable<Home>{ //change <P> in to <''> want to adapt

	@Override
	public Home rent() {
		return new Home(); // return Home object 
	}

}
