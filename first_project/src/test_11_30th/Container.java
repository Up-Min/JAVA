package test_11_30th;


// 1번
public class Container<T> {
	private T t;
	
	public Container() {
		
	}
	public Container(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}

// 2번
//public class Container<T,J>{
//	private T t;
//	private J j;
//	
//	public void set(T t, J j ) {
//		this.t = t;
//		this.j = j;
//	}
//
//	public T getkey() {
//		return t;
//	}
//	public J getValue() {
//		return j;
//	}	
//}



