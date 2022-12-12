package test_11_29th;

public class GenericEx {

	public static void main(String[] args) {
		
//		Box<String> box1 = new Box<String>();
		Box<String> box1 = new Box<>();
		box1.content = "안녕하세요";
		String str = box1.content;
		System.out.println(str);
		
		Box<Integer> box2 = new Box<>();
		//by Box<T> -> content can change their value
		// wheather they want.
		box2.content = 100;
		int val = box2.content;
		System.out.println(val);
	}

}
