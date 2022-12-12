package test_11_30th_extends;

public class Generic_Ex {
	//limited type parameter
	
	public static<T extends Number> boolean compare(T t1, T t2) {
		// receive TypeParameter (T t1, T t2) -> add <T> after static
		// as boolean can handle as static <T> Box
			// + add extends! (limited type parameter) -> number, child of number only to use!!
		  	// as add extends Number, child class double is able to use.	
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue(); // type none-selected, ad red underline.	
		
		return(v1==v2);
	}
	
	public static void main(String[] args) {
		boolean result1 = compare(10, 20); //compare 2 Integer
		System.out.println(result1);
		
		boolean result2 = compare(4.5, 4.5); //compare 2 double
		System.out.println(result2);
	}
}
