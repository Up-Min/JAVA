package test_11_24th_object;

public class HashCodeEx {
	//HashCode
	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		Student s3 = new Student(2, "홍길동");
		Student s4 = new Student(1, "김길동");
		
		System.out.println(s1.equals(s2)); // result -> false
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode()); // 2 hashCodes are different.
		System.out.println(s3.hashCode()); 
		System.out.println(s4.hashCode()); 
		// after overide hashcode.
		// if no, name.hashcode is same : same hashcode.
		
	// HashCode means?
	// A integer recognize object (using object's memory address)
		
		
		
		if(s1.hashCode() == s2.hashCode()) {

			System.out.println("같습니다");
		}else {
			System.out.println("다릅니다");
		}
	}

}
