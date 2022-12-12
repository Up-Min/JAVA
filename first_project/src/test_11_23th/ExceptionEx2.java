package test_11_23th;

public class ExceptionEx2 {

	// normal exception
	// should use try-catch
	public static void main(String[] args) throws ClassNotFoundException {
		try {
			Class.forName("java.lang.String"); // code finds class (input)
			System.out.println("java.lang.String 클래스가 존재합니다.");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
