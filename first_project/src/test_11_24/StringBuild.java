package test_11_24;

public class StringBuild {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();	
		for (int i=1; i<=100; i++) {
				str.append(i+" ");
		}
		String a = str.toString();
		System.out.println(a);
				
		

	}

}
