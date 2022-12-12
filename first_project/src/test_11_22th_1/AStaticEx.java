package test_11_22th_1;

public class AStaticEx {

	public static void main(String[] args) {
		// 반드시 A 객체 생성을 통해서 접근해야했던 인스턴스 멤버와 다르다.
		AStatic.B b = new AStatic.B();
		/*
		 * b클래스 객체가 돌아가면서 생성자 실행
		 * new Astatic에 의한 B() -> field1 -> method1 이 찍힘.
		 */
	 System.out.println(b.field1);	
	 b.method1();
	}
}
