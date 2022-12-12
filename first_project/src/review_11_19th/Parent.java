package review_11_19th;

public class Parent {

	public int a = 50;
	public String b = "가가가";

	public void c(int c, String d) {
		this.a = c;
		this.b = d;
		System.out.println("부모에게 있는 메소드");
		System.out.print(a+"  ");
		System.out.println(b);
	}

	public void d() {

		System.out.println(a);
		System.out.println(b);
	}
	
	public Parent() {
		System.out.println("부모 생성자 호출");
	}

}
