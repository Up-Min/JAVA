package test_12_2nd_vector;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList2 {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		LinkedList list2 = new LinkedList();
		
		// declare two variable to save start, finish time
		long startTime;
		long endTime;
			startTime = System.nanoTime();
			for(int i=0; i<10000; i++) {
				list1.add(0, String.valueOf(i)); // keep change 0 index.
			}
			endTime = System.nanoTime();		
			System.out.printf("%-17s %8d ns \n", "ArrayList 걸린 시간:", (endTime-startTime));
			
			startTime = System.nanoTime();
			for(int i=0; i<10000; i++) {
				list2.add(0, String.valueOf(i)); // keep change 0 index.
			}
			endTime = System.nanoTime();	
			System.out.printf("%-17s %8d ns \n", "LinkedList 걸린 시간:", (endTime-startTime) );

		// if code has lot edit, add process, using linedlist will be better.
			
	}

}
