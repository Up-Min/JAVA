package test_11_18th;

public class Student extends Person {

	// 필드
	public int studentNo;
	
	// 생성자
	public Student (String name, int StudentNo) {
		super(name); 
		// 부모클래스에 있는 person 실행. -> 부모클래스의 name에 이름 할당
		// 부모생성자 호출
		this.studentNo = StudentNo;
	}
	

	//메소드
	public void study() {
		System.out.print("공부를 합니다. ");
	}
}
