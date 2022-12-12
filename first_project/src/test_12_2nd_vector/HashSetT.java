package test_12_2nd_vector;

import java.util.HashSet;


public class HashSetT {

	public static void main(String[] args) {
//		Set<String> set = new HashSet<String>();
		HashSet<String> set = new HashSet<String>();
		// HashSet is child object from Set

		set.add("JAVA");
		set.add("JSP");
		set.add("JSDJAKLSD");
		set.add("JAVA");
	
		int size = set.size();
		System.out.println(size);
		
	}
}
