package test_11_23th;

public class ExceptionEx3 {
	// if, error detected 2?
	public static void main(String[] args) {
		String[] array = {"100", "1oo"}; // make exception number 100, eng string 1oo
		
		for (int i=0; i<=array.length; i++) {  // make exception array overflow
			try {
				int value = Integer.parseInt(array[i]); // to int data change
				System.out.println("array["+i+"] :" + value);
			} catch(ArrayIndexOutOfBoundsException e) { // use 2 catch!
				e.printStackTrace();
			} catch(Exception e) { //Exception should not declare first. (if want to log index out exception first) 
				e.printStackTrace();
			} 
		}
		
	}

}
