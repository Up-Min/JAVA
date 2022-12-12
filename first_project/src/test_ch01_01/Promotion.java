package test_ch01_01;

public class Promotion {
	public static void main(String[] args) {
		
//	byte byteValue = 10;	int intValue = byteValue;	System.out.println(intValue);
//	char charValue = '가';	intValue = charValue;	System.out.println(intValue);
//	intValue = 50;	long longValue = intValue;	System.out.println(longValue);
//	longValue = 100;	float floatValue = longValue;	System.out.println(floatValue);
//	floatValue = 100.5f;	double doubleValue = floatValue;	System.out.println(doubleValue);
	// 작은 단위에서 큰 단위로 변환 하는 것 가능함
//	
//	int intValue = 44543523; byte byteValue = (byte)intValue; System.out.println(byteValue);
//	//int 형으로 많은 숫자가 들어갔으나 byte로 강제형변환 덕에 숫자가 모두 표현되지 않음.
//	
//	long var1 = 300; int var4 = (int)var1; System.out.println(var4);
//	int var5 = 65; char var6 = (char)var5; System.out.println(var6);
//	double var7 = 3.14; int var8 = (int)var7; System.out.println(var8);
	// 동일한 강제형변환 
//	
//	byte x = 10; byte y = 20; byte result = (byte) (x+y); System.out.println(result);
//	
//	byte v3 = 10; int v4 = 100; long v5 = 1000L;
//	long result1 = v3+v4+v5; System.out.println(result1);
//	
//	char v6 = 'A'; char v7 = 1; int result2 = v6+v7; System.out.println(result2);
//	int v8 = 10; double result5 = v8/4.0; System.out.println(result5);
//	
//	String str = "안녕하세요";
//	int val = 1;
//	String val2= "3";
////	System.out.println(str + val);
////	System.out.println(val+val2);
////	System.out.println(2+val+val2);
//	
//	byte value = Byte.parseByte(val2); //문자형 -> byte형
//	int value1 = Integer.parseInt(val2); //문자형 -> int형
//	double value2 = Double.parseDouble(val2); //문자형 -> double형 
//	System.out.println(value+value1+value2);
//	
//	String str2 = String.valueOf(val); //기본형을 string형으로 변환
		
	System.out.printf("이름:%s \n","감자바");  // %s, 문자열을 그대로 출력해줌
	System.out.printf("이름:%d \n",25); //%d 정수 그대로 출력해줌
	System.out.printf("실수:%10.2f \n",3.2341234134); 
	//%f 실수를 출력해줌. 10.2f -> 10자리를 만드는데 소수점 아래 2자리까지만 표현함. 나머지는 공백 
	System.out.printf("정수출력 1:%-6d\n",143); //%6d 정수 6자리를 출력해줌, 부족한 숫자는 공백으로 만듬 
	// %-6d 하면 그냥 부족한 숫자 칸을 땡김
	System.out.printf("정수출력 1:%d, 실수출력 : %f",143,3.234); //두개를 사용할 수도 있다.
	
	

		
	
	
	
	
	
	
	}
}
