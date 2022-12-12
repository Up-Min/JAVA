package test_11_23th;
	//Throwing exception
public class ThrowsEx {

	public static void main(String[] args) {
		try {
			findClass(); //handles exception where bring up method.
		} catch(Exception e){
			e.printStackTrace();

		}
	}	
	// use "throws"
	public static void findClass() throws Exception{
		Class.forName("java.lang.String2");
	}
}
