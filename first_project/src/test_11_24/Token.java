package test_11_24;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Token {

	public static void main(String[] args) {
		String a = "아이디,이름,패스워드";
		StringTokenizer st = new StringTokenizer(a, ",");
		while(st.hasMoreTokens()) {
			String t = st.nextToken();
			System.out.println(t);
		}
		
	}

}
