package test_11_24th_object;

public class Member extends Object{
	
	//field
	public String id;
	
	// constructor
	public Member(String id) {	
		this.id = id;
	}

	//override to make logically same
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) { 
		// check obj has Member?
		// do Casting (forced-typechange)
			Member target = (Member)obj;
		//Member is child object, Object obj is parent object
	//why? obj is child object,
	// equals(Object obj = = new Member("blue")
	// have to bring child object's field.
	// -> do Casting
			if(id.equals(target.id)) {
		// compares only String's equals (text)
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void main(String[] args) {
//		Object obj1 = new Object(); 
//		//object is also class, can declare like other under class
//		
//		Object obj2 = obj1;
//		// same address as well in heap. 
//		
//		System.out.println(obj1.equals(obj2)); // compares address.
//		// print 'true'
//		System.out.println(obj2 == obj1);
//		// print 'true'
//	
//		// logically same : no matter how same/different object, object data which saved is same. 
//		// in String, we have to use 'equals' to handle 2diffrent objects are same.
//		// because '==' is compares address, 'equals' is compares value(data).
//
//		
//	}
}
