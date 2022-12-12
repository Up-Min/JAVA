package test_11_11th;

import java.util.Calendar;

public class Week_ex {
	// 열거함수 
	public static void main(String[] args) {
		Week today = null; // 상단에 작성한 enum (week.java)
		
		Calendar cal = Calendar.getInstance();
		
		// 요일을 숫자로 얻게 해줌
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		// 위에서 받은 숫자를 열거상수로 변환해서 변수에 대입함.
		switch (week) {
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUESDAY; break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.THURSDAY; break;
		case 6: today = Week.FRIDAY; break;	
		case 7: today = Week.SATURDAY; break;
		}
		
		System.out.println(today);
		
		if(today == Week.SUNDAY) {
			System.out.println("오늘은 일요일입니다.");
		}else {
			System.out.println("일요일이 아닙니다."+today+"입니다.");
		}
		
		
	}

}
