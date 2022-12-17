package ch07.com.dao;

import java.util.regex.Pattern;

public class Member {

	private String String1;
	private String String2;
	
	public static final String pattern1 = "\\w+@\\w+\\.\\w+(\\.\\w+)?"; //
	public static final String pattern2 = "(02|010)-\\d{3,4}-\\d{4}";

		public String result(String string1, String string2){
			this.String1 = string1;
			this.String2 = string2;
			String result;
			
			boolean result1 = Pattern.matches(pattern1,String1);
			boolean result2 = Pattern.matches(pattern2,String2);
			
			if(result1 == true && result2 == true) {
				result = "환영합니다";
			}else {
				result = "유효성 검사에 통과하지 못했습니다.";
			}
			return result;
		}

		public String getString1() {
			return String1;
		}

		public void setString1(String string1) {
			String1 = string1;
		}

		public String getString2() {
			return String2;
		}

		public void setString2(String string2) {
			String2 = string2;
		}
		
		
		

}
