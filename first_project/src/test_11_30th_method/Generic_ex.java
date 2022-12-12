package test_11_30th_method;

public class Generic_ex {
	// Declare Generic method
	// not to declare addtional object, use static
	public static<T> Box<T> boxing(T t) {
		// add <T> after static, Box, parameter
		// if declare T, adapt at Box(class), boxing (parameter)
		
		Box<T> box = new Box<T>(); // Declare box 
		box.set(t);
		return box;
	}

	public static void main(String[] args) {
		// call Generic method, change T to Integer
		Box<Integer>box1 = boxing(100);
	// same as Box box1, but set type as Integer 
							//add type, parameter at boxing
		int intValue = box1.get();
		System.out.println(intValue);
	//Declare T as integer -> activate box.set -> private t is 100
	// -> get(to return) -> as int (don't have to casting because generic)
	// -> return Integer value 100.

		
		Box<String>box2 = boxing("Lee");
		String strValue = box2.get();
		System.out.println(strValue);
	// same as line 25~27, but declared as String.
		
		
		
	}
}
