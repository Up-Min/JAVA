package test_11_25th.date;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateOpEx_1 {

	public static void main(String[] args) {
		// data format set
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		
		// set especial days
		LocalDateTime startDateTime = LocalDateTime.of(2021, 1, 1, 0, 0, 0, 0);
		// set as 2021.1.1 00:00:00
		
		System.out.println("시작일 : " + startDateTime.format(dtf));
		
		LocalDateTime endDateTime = LocalDateTime.of(2021, 12, 31, 0, 0, 0, 0);
		System.out.println("종료일 : " + endDateTime.format(dtf));
		
		if(startDateTime.isBefore(endDateTime)) { // is SDT is before from EDT?
			System.out.println("아직 안끝남");
		}else if (startDateTime.isEqual(endDateTime)) {
			System.out.println("끝남");
		}else if(startDateTime.isAfter(endDateTime)) {
			System.out.println("지났음");
		}
	}
}
