package review_11_19th;

public class getter_setter {

	private int a = 10;
	private String b = "홍길동";
	
	// 고사리손으로 직접 빚은 getter, setter
	public void change(int i, String s) {
		this.a = i;
		this.b = s;
	}
	public int out_i() {
		return a;
	}
	public String out_s() {
		return b;
	}
	
	// 더러운 기계가 만들어준 getter, setter
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	
	
	
	
	
}
