package Test_11_9th;

public class Compareoperation {

	public static void main(String[] args) {
		//비교연산자
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2);
		
		System.out.println(result1);
		
		char char1 = 'A';
		char char2 = 'b';
		boolean result2 = (char1 == char2);
		System.out.println(result2);
		
		int num3 = 1;
		double num4 = 1.0;
		boolean result3 = (num3 == num4);
		System.out.println(result3);

		float num5 = 0.1f;
		double num6 = 0.1;
		//float double은 정밀도가 다르기때문에 비교시 강제형변환으로 맞춰줘야함
		boolean result4 = (num5 == (float)num6);		
		boolean result5 = (num5 == num6);
		System.out.println("--------------------");
		System.out.println(result4);
		System.out.println(result5);
		
		String str1 = "자바";
		String str2 = "JAVA";
		boolean result6 = (str1.equals(str2));
		System.out.println(result6);
		
	}
}
