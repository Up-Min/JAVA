package test_11_23th;

public class ExceptionEx {
	
	// Unchecked Exception
	// declare method
	public static void printLength(String data) {
		try { // input code to run
			
			int result = data.length(); //string length.
			System.out.println("문자 수 : " + result);
		}catch(NullPointerException e) { 
			// one of error class, NullPointerException. so if want to response to error.
			// use Error class which detected on Colsolelog.
			
			// and input code when error detected.
			System.out.println(e.getMessage()); // normally use., returns only reason why error detected
			// -> Cannot invoke "String.length()" because "data" is null
//			System.out.println(e.toString()); // returns error reason, error kind
			// -> java.lang.NullPointerException: Cannot invoke "String.length()" because "data" is null
//			e.printStackTrace(); //returns error reason, error kind, error location.
			// -> java.lang.NullPointerException: Cannot invoke "String.length()" because "data" is null
			// at test_11_23th.ExceptionEx.printLength(ExceptionEx.java:9)
			// at test_11_23th.ExceptionEx.main(ExceptionEx.java:32)
			
		}finally { // finally is optional sentence (no matter error detected, activate codes belong)
			System.out.println("마무리 실행 ");
		}

	}
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작 ");
		printLength("ThisIsJava");
		printLength(null); // null point error detect (by String is null)
		System.out.println("프로그램 종료");
		
		

	}

}
