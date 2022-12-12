package review_11_19th;

public class Method_overload_ex {

	
//	// Instance of
//	public static void Check (Diver_normal string) {
//		
//		System.out.println(string.a);
//		string.run();
//		
//		if(string instanceof Diver_summer) {
//			// instanceof를 통해 해당 값 유무를 확인. 
//			Diver_summer ds = (Diver_summer) string;
//			ds.runin();
//			System.out.println(ds.a);
//		}
//		
//		
//	}
//
//	
	
	public static void main(String[] args) {

		
		
// Instance of
//		Diver_normal dn1 = new Diver_normal("dn1 스트링");
//		Check(dn1);
//		
//		Diver_normal dn2 = new Diver_summer("dn2 스트링", 15);
//		Check(dn2);
//	
		
		
		// ★★★★★ 다형성 ★★★★★
		// 매개변수를 통한 다형성 적용
//		
//		Diver_normal dn = new Diver_normal();
//		Diver_summer ds = new Diver_summer();
//		Diver_winter dw = new Diver_winter();
//		
//		dn.run("평소");
//		ds.run("여름");
//		dw.run("겨울");
		
		
		
		
		// 필드 변경을 통한 다형성 적용
//		Diver d = new Diver();
//		d.Di = new Diver_normal();
//		d.run();
//		
//		Diver d1 = new Diver();
//		d1.Di = new Diver_summer();
//		d1.run();
//		
//		Diver d2 = new Diver();
//		d2.Di = new Diver_winter();
//		d2.run();
		
		
		
		
		
		
		
		
		
		
		
		
//		// 자동타입변환
//		Change_Parent cp = new Change_Child();
//		cp.A();
//		cp.B();
//		cp.C();
//		
//		// 강제 타입 변환
//		Change_Child cc = (Change_Child) cp;
//		cc.C();
//		cc.D(); // 접근 불가능 했던 Change_Child속의 D 접근 가능
		
		
		
		
		// 인터페이스 형태 상속 - 거기서 응용한 오버라이드
//		Interface_Child ic = new Interface_Child();
//
//		// 이렇게 하면 값이 바뀌지 않음. 
//		ic.speedUp();
//		
//		// speedUp에 if로 조건문을 만들어서 다르게 값이 나올 수 있게 해줌.
//		ic.nowspeed = Interface_Child.overspeed;
//		ic.speedUp();

		
		
		//상속, 오버라이드
//		
//		Parent pr = new Parent();
//		Child ch = new Child();
//		// Child 패키지의 새로운 Child 생성자 발동.
//		// 이때 Child 생성자 안에 Parent의 상속받은 값 super(); 을 넣어준다.
//		// 결과값으로 "부모 생성자 호출" 이 먼저 나타나고, 그 후에 "자식 생성자 호출"이 나타난다
//		
//		
////		ch.a(100,"자식이 넣은 나나나"); //자식클래스를 통해 부모클래스에 선언된 필드에 값 입력
////		ch.e(); // 자식 클래스에서만 선언한 메소드
//		
//		
//		pr.c(10, "스트링 테스트"); // 부모클래스에서 있는 메소드 c 작동
//		ch.c(10, "스트링 테스트"); //자식 클래스에서 오버라이딩 된 메소드 c 작동
//		
		
		
		
////		 getter, setter
//		getter_setter gs = new getter_setter();
//		
//		// private처리 된 int String 접근 불가
////		gs.a = 20;
////		gs.b = "김길동";
//		// private처리 된 int String 출력 불가
////		System.out.println(gs.a);
////		System.out.println(gs.b);
//
//		// getter 이용한 private 변수 접근
//		gs.change(20, "김길동");
//		
//		//setter 이용한 private 변수 출력
//		System.out.println(gs.out_i());
//		System.out.println(gs.out_s());
//		
//		// 컴퓨터가 만들어준 getter, setter 활용
//		gs.setA(30);
//		gs.setB("홍홍홍");
//		System.out.println(gs.getA());
//		System.out.println(gs.getB());
			
		
		
		
	// final 필드 작동 및 이해.	
//		final_base fb = new final_base(5, "kart");
//		System.out.println(fb.a);
//		System.out.println(fb.b);
//		//System.out.println(fb.c);
//		System.out.println(fb.d);
//		
//		System.out.println(final_base.c);
//			

//		mo.out("매개변수 하나 입력 받는 void out의 1글자");
//		mo.out("매개변수 하나 입력 받는 void out의 1글자","2글자");
//		

		
		
		
		// static을 왜 쓰는가?
		
//		static_base sb1 = new static_base("1");
//		System.out.println(static_base.a);
//		
//		static_base sb2 = new static_base("1");
//		System.out.println(static_base.a);
//		
//		static_base sb3 = new static_base("1");
//		System.out.println(static_base.a);
//		
//		static_base sb4 = new static_base("1");
//		System.out.println(static_base.a);
//		
//		static_base sb5 = new static_base("1");
//		System.out.println(static_base.a);
		
	}

}
