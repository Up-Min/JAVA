package test_11_23th;

import java.io.IOException;

public class FileWriter implements AutoCloseable{
	public FileWriter(String filepath) throws Exception{
		System.out.println(filepath + "파일을 엽니다.");
	}
	public void write(String data) throws Exception{
		System.out.println(data + "를 파일에 저장합니다.");
	}
	@Override
	public void close() throws Exception {
		System.out.println("파일을 닫습니다.");
	}
	
	
}
