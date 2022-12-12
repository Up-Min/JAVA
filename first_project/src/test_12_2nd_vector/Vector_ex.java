package test_12_2nd_vector;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Vector_ex {
	public static void main(String[] args) {
		// making board by using thread.
		
		//save Board object in Vector
//		List<Board> list2 = new Vector<>(); // Vector's parent is List interface. // auto-typechange	
//		list2.add(null);
//		
		
//		Vector<Board> list = new Vector<>(); 
		ArrayList<Board> list = new ArrayList<>(); 
		
		// vector is available sync. wait until thread A finish, then run B.
		// so size can 2,000
		
		// however, ArrayList doesn't support sync. each before array printout properly,
		// next array will appear. so returning print will be next array (value is OVERWRITED)
		// so size is not return properly.
		
		Thread threadA = new Thread() {
			@Override
			public void run() {
				for(int i=1; i<=10000; i++) { 
					// Board has 3 parameter
					list.add(new Board("제목", "내용", "글쓴이"));
					System.out.println("thread A " + i + " Added");
				}
			}	
		};		
		Thread threadB = new Thread() {
			@Override
			public void run() {
				for(int i=10001; i<=20000; i++) {
					// Board has 3 parameter
					list.add(new Board("제목", "내용", "글쓴이"));
					System.out.println("thread B " + i + " Added");
				}
			}
		};	
		threadA.start();
		threadB.start();		
		//code waiting main thread until work thread finish
		
		/* as multi thread theory, no matter main, work thread is running. process is never stop.
		 * it means if main thread is finished, work thread is still running. 
		 * can cause console result return not properly as developer planned.
		 * 
		 * to protect situation upper, use thread.join to finish work thread properly,
		 * and finish main thread as developer planned.  
		 */
		try {
			threadA.join();
			threadB.join();
		} catch (Exception e) {
		}
		int size = list.size();
		System.out.println("총 객체 수 : "+ size);
		System.out.println("");
		
		
	}
}
