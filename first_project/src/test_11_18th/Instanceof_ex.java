package test_11_18th;


// 객체의 타입을 확인해주는 instanceof
public class Instanceof_ex {

	// 메소드 추가 생성
	public static void personInfo(Person person) {
		// static 붙인 이유? 공유할 수 있는 전역변수. 객체를 생성하지 않고도 사용하기 위해.
		System.out.println("name : " + person.name);
		person.walk();
		
		if(person instanceof Student) { 
			//person이 Student 객체를 초함하고 있는가?
			// 맞으면 강제타입 변환을 시킴
			Student student = (Student) person;
			student.study();
			System.out.print(student.studentNo);
		}
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("홍홍홍");
		// 객체가 생성되는 순간. this.name을 통해 name에 홍홍홍이 저장됨.
		personInfo(p1);
		// 이름을 넘겨줌.
		// personInfo의 Person person = new Person("홍홍홍") 이것과 동일해짐.
		// 그래서 Person의 this.name을 통해 이름이 저장되는 거.
		// 그리고 personInfo의 walk를 통해 "걷습니다." 가 나옴.
		
		Person p2 = new Student("김김김", 10);
		/* Student 객체에 있는 Student 생성자 시작. 
		 * 이름 - super name 통해서 부모클래스에 있는 name -> this.name -> String name에
		 * 저장되게 됨
		 * 10 - this.StudentNo 저장으로 Student에 지정된 int.StudentNo 에 저장
		 */
		personInfo(p2);
		// Person person = new Person("김김김") 이것과 동일해짐.		
	}
}
