package test_11_24th_object;

public class EqualsEx {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("같습니다");
		} else {
			System.out.println("다릅니다");
			// before logically same
			// obj1, obj2 declares different object,
			// so address is different.
			// console result will be different.
			
			// after logically same
			// (compares only value in object)
			// launch Member's overrrided eqauls
			// obj2 -> Object obj -> check instanceof
			// ->  Casting -> compares obj1, obj2's id
			// -> ("blue" / "blue") -> return true
			// console result will be same	
		}
		if(obj1.equals(obj3)) {
			System.out.println("같습니다");
		} else {
			System.out.println("다릅니다");
			}
	}

}
