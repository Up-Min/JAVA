package test_11_15th;

public class Korea {

	// FINAL 필드
	final String nation = "대한민국";
	final String ssn; // 주민번호
	/* final에 저장된 이 값들을 변경할 수 없어짐. (최종값)
	/ 현재, 대한민국으로 저장된 nation은 바꿀 수 없음.
/ ★ 무조건 초기값을 줘야 함. 어떻게? 필드 선언시 or 생성자를 통해서 줄 수 있다.
	 * */

	// 인스턴스 필드
	String name;

	// 생성자 - 객체 인스턴스가 실행될 때 작동되는 코드
	Korea(String ssn, String name) {
	// final로 선언된 ssn값을 초기화시키지 않으면 빨간줄이 뜸.
		this.ssn = ssn; //초기값 선언
		this.name = name;
	}
	

}
