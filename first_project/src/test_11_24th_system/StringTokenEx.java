package test_11_24th_system;

import java.util.StringTokenizer;

public class StringTokenEx {

	public static void main(String[] args) {
		String data1 = "홍길동&이수홍,박연수";
		
		String[] arr = data1.split("&|,");
		for(String token : arr) {
			System.out.println(token);
		}
		
		// use Stringtokens
		String data2 = "홍길동/이수홍/박연수";
		StringTokenizer st = new StringTokenizer(data2,"/");
		System.out.println(st.countTokens());
							// Divide data2 with "/"
		while(st.hasMoreTokens()) {
			// check st has tokens left.
			String token = st.nextToken();
			System.out.println(token);
		}

	}

}
