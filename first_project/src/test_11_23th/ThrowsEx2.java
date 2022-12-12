package test_11_23th;
	//Throwing exception
public class ThrowsEx2 {

	// main method runs in jvm
	// if main throws Exception -> Exception details come up on Console
	public static void main(String[] args) throws Exception {
			findClass(); // ClassNotFoundException (normal exception should try-catch or add-through
	}	
	// use "throws"
	public static void findClass() throws Exception {
		Class.forName("java.lang.String2");
	}
}
