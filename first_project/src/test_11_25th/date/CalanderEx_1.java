package test_11_25th.date;

import java.util.*;

public class CalanderEx_1 {

	public static void main(String[] args) {
		// create time zone 
		TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar now = Calendar.getInstance(tz); 
		// bring time and date
		System.out.println(now);

		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(week);
		
		String strweek = null;
		
		switch (week) {
		case Calendar.MONDAY: strweek = "월"; break;
		case Calendar.TUESDAY: strweek = "화"; break;
		case Calendar.WEDNESDAY: strweek = "수"; break;
		case Calendar.THURSDAY: strweek = "목"; break;
		case Calendar.FRIDAY: strweek = "금"; break;
		case Calendar.SATURDAY: strweek = "토"; break;
		case Calendar.SUNDAY: strweek = "일"; break;

		}
		System.out.println(strweek);
		
		int amPm = now.get(Calendar.AM_PM);
		System.out.println(amPm);
		System.out.println(Calendar.AM);
		
		if(amPm == Calendar.AM) {
			System.out.println("오전");
		}else {
			System.out.println("오후");
		}
		
		System.out.println(now.get(Calendar.HOUR)+","+now.get(Calendar.MINUTE)+","+now.get(Calendar.SECOND));
		
		// hour : standards morning / afternoon(0~11) 12H type
		
		
		
		
	}

}
