package test_12_5th_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteEx2 {
	public static void main(String[] args)  {
		try {//output stream
			FileOutputStream fo = new FileOutputStream("C:/Temp/test1.db");
												// create file
			byte a = 10;
			byte b = 20;
			byte c = 30;
			byte d = 120;
			int e = 240;
			int f = 2000;
	
			fo.write(a); // save in buffer each 1byte
			fo.write(b);
			fo.write(c);
			fo.write(d);
			fo.write(e);
			fo.write(f);
			
			fo.flush(); // output All byte in buffer, make buffer empty. (in this time. write in test1.db)
			fo.close(); //must close output stream.
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}
}