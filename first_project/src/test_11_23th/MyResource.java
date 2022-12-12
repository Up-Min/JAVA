package test_11_23th;

public class MyResource implements AutoCloseable{
	// field
	
	private String name;
	
	// constructor
	public MyResource(String name) {
		this.name = name;
		System.out.println("MyResource" + name + "열기");
	}
	
	//method
	public String read1() { // name on read1 is field 'name'.
		System.out.println("MyResource" + name + "읽기");
		return "100";	
	}
	public String read2() {
		System.out.println("MyResource" + name + "읽기");
		return "abc";
	}

	@Override
	public void close() throws Exception {
// as implements Autocloseable, void close is automatically runs
// when Resource (MyResource) run.
		System.out.println("MyResource" + name + "닫힘");
	}

	 // closing method, but it is interface.
	// so declare method as well
	
	
}
