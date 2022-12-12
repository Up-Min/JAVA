package test_11_28th_Format;

import java.util.regex.Pattern;

public class Patter_ex {

	public static void main(String[] args) {
		/*
		 *  02-222-222
		 *  010-222-222
		 */
		String regExp = "(010|02)-\\d{3,4}-\\d{4}"; // will put pattern in String, checking phone number 
		String data = "010-123-4567";
		// \d{3,4} ->  3 or 4 digits will insert
		
		boolean result = Pattern.matches(regExp, data); // pattern, String wants to check.
		System.out.println(result);
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		// why have to use escape number? not '\' but '\\'? 
		// to recognize \w, use \ once again.
		data = "test@naver.com";
		result = Pattern.matches(regExp, data); 
		System.out.println(result);
		
		

	}

}
