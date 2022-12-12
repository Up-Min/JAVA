package test_11_28th_reflect;

public class GetResource_ex {
	// get resource path
	public static void main(String[] args) {
		Class clazz = Car.class;
		
		// get image's location 
		String photo1 = clazz.getResource("burger_200402_01.jpg").getPath();
		
		// get folder's location (img located)
		String photo2 = clazz.getResource("imgs/burger_200402_01.jpg").getPath();
		
		System.out.println(photo1);
		System.out.println(photo2);
	}

}
