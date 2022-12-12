package test_11_23th;

public class Car_ex {

	public static void main(String[] args) {
		
		Car c = new Car();
		
		c.run();
		c.run2();
		c.run3(new Tire() {//inputs nameless object
			// same as Tire t = new Tire();
			@Override
			public void roll() {
				System.out.println("미쉐린 타이어가 굴러감");		
			}
		}); 
	}

}
