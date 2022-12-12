package test_11_10th;

public class MainStringArrayArg {

	public static void main(String[] args) {
		// main도 하나의 메소드다, args는 값을 미리 넣어두는 것.
		//args 값이 0으로 나옴, 따로 입력을 해줘야함.
		System.out.println(args.length);
		if(args.length !=2) {
			System.out.println("입력값이 부족");
			System.exit(0); //프로그램 강제 종료
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];

		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);

		int result = num1 + num2;
		System.out.println(result);
	}

}
