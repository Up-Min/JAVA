package test_11_10th;

import java.util.Arrays;

public class StringMethod_ex {

	public static void main(String[] args) {
		// 문자열 길이 인식
//		String ssn = "534256 1234056"; // 주민번호
//		char gender = ssn.charAt(7); // ssn의 7번 인덱스를 지정
//		int a = ssn.length();
//
//		System.out.println(a);
//		if (a == 14) {
//			System.out.println("주민번호 자리수가 맞음");
//		} else {
//			System.out.println("주민번호 자리수가 안 맞음");
//		}
//
//		switch (gender) {
//		case '1':
//		case '3':
//			System.out.println("남자");
//			break;
//		case '2':
//		case '4':
//			System.out.println("여자");
//			break;
//		}
		
		// 문자열 대체
//		String oldStr = "자바문자열";
//		String newStr = oldStr.replace("자바", "JAVA");
//		System.out.println(newStr);
		
		// 문자열을 잘라주는 substring
//		String ssn = "985234-1423748";
//		String firstName = ssn.substring(0,6); //0번서부터 6번까지 찍어주는
//		System.out.println(firstName);
//	
//		String secondName = ssn.substring(7); // 7번서부터 끝까지 찍어주는
//		System.out.println(secondName);

		
		//indexOf
//		String subject = "자바 프로그래밍";
//		int location = subject.indexOf("프로그래밍");
//		// 주어진 문자열 번호가 있을 때, 그 문자열이 시작되는 번호를 알려줌
//		System.out.println(location);
//		
//		String substring = subject.substring(location);
//		// 3번 인덱스부터 끝가지 문자를 잘라서 가져옴. 그래서 프로그래밍이 됨.
//		System.out.println(substring);
//			
//			// indexOf 응용, 단어 여부 확인
//			if(location == -1) {
//				System.out.println("해당 문자열이 없습니다");
//			}else {
//				System.out.println("해당 문자열이 있습니다");				
//			}
		
		// contains -> true/false return
//		String subject = "자바 프로그래밍";
//		boolean result=subject.contains("자바");	
//		if(result == true) {
//			System.out.println("자바 가 문자안에 있습니다");
//		}else {
//			System.out.println("자바 가 문자안에 없습니다");			
//		}
		
		// 배열을 나누는 split
//		String board = "1, 자바 학습, 참조 타입, String, 공부중";
//		String[] tokens = board.split(",");
//		
//		String line = Arrays.toString(tokens);
//		System.out.println(line);
//		
//		for (int i = 0; i<tokens.length; i++) {
//			System.out.println(tokens[i]);
//		}
		
		
	}
}
