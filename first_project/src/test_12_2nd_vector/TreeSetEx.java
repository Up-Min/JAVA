package test_12_2nd_vector;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		//Declare TreeSet
		TreeSet<Integer> scores = new TreeSet<>();
		
		// add data
		scores.add(7);
		scores.add(4);
		scores.add(1);
		scores.add(5);
		scores.add(9);
		
		for(Integer s : scores) {
			System.out.print(s + " "); // auto array (by higher value)
		}
		System.out.println();	
		System.out.println("least number " + scores.first());
		System.out.println("last number " + scores.last());
		System.out.println("smaller than '5' : " +  scores.lower(5));
		System.out.println("bigger than '5' : " +  scores.higher(5));
		System.out.println();
		
		// array by lower value
		System.out.println("===== array by lower value =====");
		NavigableSet<Integer> descend = scores.descendingSet();
		for(Integer s : descend) {
			System.out.print(s + " "); // auto array (by higher value)
		}System.out.println();
		
		
		// range search (variety) (5 <= score)
		System.out.println("===== range search (variety) =====");
		NavigableSet<Integer> rangeSet = scores.tailSet(5, true);
		for(Integer r : rangeSet) {
			System.out.print( r + " ");
		}
		System.out.println();
		//(null, false) -> (5, true) means return higher than 5, true/false for include value (this. 5)
		
		// range search (variety) (4 <= score < 9)
		System.out.println("=== range search (variety) (4 <= score < 9) ===");
		rangeSet = scores.subSet(4, true, 9, false);
		for(Integer r : rangeSet) {
			System.out.print(r + " ");
		}
		
	}

}
