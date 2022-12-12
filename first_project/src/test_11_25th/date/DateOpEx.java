package test_11_25th.date;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateOpEx {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		
		// data format set
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		System.out.println(now.format(dtf));
		
		LocalDateTime result1 = now.plusYears(1); // add 1 year
		System.out.println(result1.format(dtf)); // add data format to end at second
		
		LocalDateTime result2 = now.minusMonths(2); // odd 2 months
		System.out.println(result2);

		LocalDateTime result3 = now.plusDays(7); // add 7 days
		System.out.println(result3);
	}
}
