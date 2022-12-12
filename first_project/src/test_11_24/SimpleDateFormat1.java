package test_11_24;

import java.text.SimpleDateFormat;
import java.util.*;

public class SimpleDateFormat1 {



	public static void main(String[] args) {
		
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
		String c = sdf.format(now);
		System.out.println(c);
	}





}
