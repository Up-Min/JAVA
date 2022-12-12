package test_11_29th;

public class GenericEx2 {

	public static void main(String[] args) {
		// to use generic, can make variety product

	Product<Tv, String> product1 = new Product<>();
	//input new object // k kind -> k new TV
	product1.setKind(new Tv());
	//input String // M model -> "SMART TV"
	product1.setModel("SMART TV");
	
	System.out.println(product1);

	Tv t = product1.getKind();
	String tmodel = product1.getModel();
	
	
	
	Product<Car, String> product2 = new Product<>();
	product2.setKind(new Car());
	//input String // M model -> "SMART TV"
	product2.setModel("EQUUS");
		// Product is declared as K, M
		// Tv, Car -> kind
		// String -> model
	Car c = product2.getKind();
	String cmodel = product2.getModel();
	
		
	}

}
