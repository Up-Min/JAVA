package test_11_21th;

public class Child extends Parent {
	public String name;
	
	public Child() {
		this("홍길동");
		System.out.println("Child() Call");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
