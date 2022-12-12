package test_12_5th_lamda;

public class Lamda_ex {

	public static void main(String[] args) {
		// ramda (interface void calculate(int x, int y); -> x,y)
//		action((x,y) -> {
//			System.out.println(x+y);
//		}); // why? to make simple
//		action((x,y) -> {
//			System.out.println(x-y);
//		});
		
		
		// child class+override
//		action(new Calculable() { 
//			@Override
//			public void calculate(int x, int y) {
//				System.out.println(x+y);
//			}
//		});
		
//		action(x -> System.out.println(x));
		
		action((x,y) -> System.out.println(x+y));
	}
	
	public static void action(Calculable calculable) {
		int x = 10;
		int y = 20;
		calculable.calculate(x, y);
//		calculable.calculate(x);
	}
}
