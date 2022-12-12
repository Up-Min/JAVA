package test_11_10th;

public class Equals_ex {

	public static void main(String[] args) {

		// str은 리터럴(내용)이 같으면 같은 주소를 가르킴 (참조하다)
		String strVar1 = "홍길동";
		String strVar2 = "홍길동"; // strVar1 == strVar2 의미 : 둘은 같은 주소를 지정하고 있다.

		if (strVar1 == strVar2) { // 두 str의 주소에 대응하는 참조를 비교함
			System.out.println("둘은 참조가 같음");
		} else {
			System.out.println("둘은 참조가 다름");
		}

		// 리터럴 자체를 비교하고 싶을 때
		if (strVar1.equals(strVar2)) {
			System.out.println("둘의 리터럴이 동일함");
		}

		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		// new String으로 선언 되었을 경우, 둘의 참조(주소)가 달라짐 즉 값이 다름.
		if (strVar3 == strVar4) {
			System.out.println("둘은 참조가 같음");
		} else {
			System.out.println("둘은 참조가 다름");
		}
		if (strVar3.equals(strVar4)) {
			System.out.println("둘의 리터럴이 동일함");
		} // 그러나 리터럴은 여전히 동일하다는 거.
	}
}
