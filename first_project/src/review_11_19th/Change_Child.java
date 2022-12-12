package review_11_19th;

public class Change_Child extends Change_Parent{

	@Override
	public void C() {
		System.out.println("오버라이드 된 메소드 C");
	}
	
	public void D() {System.out.println("자식 메소드 D");}
	
}
