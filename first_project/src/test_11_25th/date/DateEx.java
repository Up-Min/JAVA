package test_11_25th.date;

import java.text.SimpleDateFormat;
import java.util.*;
//import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		Date now = new Date(); // create date, time 
		System.out.println(now); 
		String strnow = now.toString();
		System.out.println(strnow); //different type (data object vs String type)
		
//		SimpleDateFormat sdf = new SimpleDateFormat();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String strnow2 = sdf.format(now);
		System.out.println(strnow2);
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		String strnow3 = sdf1.format(now);
		System.out.println(strnow3);
		
	}
}
