package ch07.com.dao;


public class GuGuDan {
	private String b;
	private int i = 1;
	StringBuilder s = new StringBuilder();
	
	public String process(int a){
		for(int i=1; i<10; i++) {
			s.append(a+"*"+i+"="+a*i + "\n");
		}
		String str = s.toString();
		return str;
	}
	
//	public void process(int a) {
//		for(int i=1; i<10; i++) {
//		System.out.println(a*i);
//	}
//	}
//	
	

	
	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	
	
}
