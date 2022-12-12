package test_11_24th_wrapper;

public class BoxingUnboxing {

	public static void main(String[] args) {

		Integer obj = 100; //boxing : make boxed-object primitive type value
		int value = obj; //unboxing : boxing object in to primitive type
		
		int value2 = obj +5; // obj is unboxing before calculating 5.
		
		System.out.println("value : " + obj.intValue());
		System.out.println("value2 : " + value2);
		
	}
}
