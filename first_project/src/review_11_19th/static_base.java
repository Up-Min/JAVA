package review_11_19th;

public class static_base {

	static int a = 0;
	
	static_base (String str) {
		System.out.print(str+" ");
		System.out.print("static 필드 값 증가 ");
		a++;
	}
	
	static_base(String str, String str1) {
		System.out.print(str);
		System.out.print(str1);
		System.out.println(" static 변수 : "+a);
	}
	static_base(String str, int int1) {
		System.out.print(str);
		System.out.print(int1);
		System.out.println(" static 변수 : "+a);
	}
	static_base(String str, int int1, int int2) {
		System.out.print(str);
		System.out.print(int1);
		System.out.print(int2);
		System.out.println(" static 변수 : "+a);
	}
	static_base(String str, int int1, int int2, int int3) {
		System.out.print(str);
		System.out.print(int1);
		System.out.print(int2);
		System.out.print(int3);
		System.out.println(" static 변수 : "+a);
	}
	
}
