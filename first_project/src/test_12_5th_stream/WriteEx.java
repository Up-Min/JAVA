package test_12_5th_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteEx {
	public static void main(String[] args)  {
		try {//output stream
			FileOutputStream fo = new FileOutputStream("C:/Temp/test2.db");
												// create file
		byte[] array = {10,20,30,40,50,60,70,80,90,100,110,120};
	
			fo.write(array); //ouutput on buffer array[]
			
			fo.flush(); 
			fo.close(); 
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}
}
