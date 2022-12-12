package review_11_19th;


public class Child extends Parent{
	
	public void a (int a, String b) {
		this.a  = a; // 부모 필드 그대로 가져오기 가능
		this.b = b;
	}
	
	public void e () {
		System.out.println("이것은 자식만의 고유한 값");
	}
	
	public Child() {
		super(); // 부모생성자를 가져올 수 있는 super.
		System.out.println("자식 생성자 호출");
	}

	@Override
	public void c(int c, String d) {
		// TODO Auto-generated method stub
		System.out.println("난 부모와 달라! " +c +"는 그냥 참고용이야!");
		System.out.println("난 부모와 달라! " +d +"는 그냥 참고용이야!");
	}
	
}
