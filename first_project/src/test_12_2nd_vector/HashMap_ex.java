package test_12_2nd_vector;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_ex {

	public static void main(String[] args) {
	
		// make hashMAP object
		// HashMap input type <key, actual value (object) >
		HashMap<String,Integer> map = new HashMap<>();
		// how to save map in object?
		// use put. 
		map.put("LEE", 100);
		map.put("KIM", 10);
		map.put("SEO", 50);
		map.put("WANG", 60);
		
		// need key to access Integer, KEY is String.
		
//		System.out.println("총 entry 수 : "+map.size());
		
//		// return value using key.
//		String key = "LEE";
//		int value = map.get(key);
//		
//		System.out.println("Actual value : " + value);
//		
//		// repeat return key (without 'for')
//		Set<String> keySet = map.keySet();
//		// use Iterator to repeat return value.
//		Iterator<String> keyIterator = keySet.iterator();
//		
//		while(keyIterator.hasNext()) {
//			String k = keyIterator.next();
//			int v = map.get(k);
//			
//			System.out.print(k+ " ");
//			System.out.println(v);
//		}
		
		// 2nd 
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
		Entry<String, Integer> entry = entryIterator.next();
		String k = entry.getKey();
		int v = entry.getValue();
		System.out.print(k+ " ");
		System.out.println(v);
		}
	}

}
