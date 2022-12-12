package test_11_24th_object;

public class ToStringEx {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("SAMSUNG", "ANDROID");
		String strobj = sp.toString();
		// toString => return object's text information.
		// @6f2b958e => 16bits hashcode inform object (all value is diffrent)
		
		// if, specially print object's text information?
		
//		System.out.println(strobj);
//		System.out.println(sp);
		
		try {
			int value = Integer.parseInt("1oo");
		} catch (NumberFormatException e) {
			System.err.println("에러");
			// make colsole output word RED.
		}
	}
}
