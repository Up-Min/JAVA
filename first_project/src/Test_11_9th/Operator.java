package Test_11_9th;

public class Operator {

	public static void main(String[] args) {
		// 부호연산자
//		int x = -100;
//		x = -x;
//		System.out.println(x);

		//
		int x = 10;
		int y = 10;
		int z;
		int w;

		x++;
		++x;
		System.out.println("x = " + x);
		System.out.println("----------------------");

		y--;
		--y;
		System.out.println("y = " + y);
		System.out.println("----------------------");

		z = x++;
		System.out.println(z);
		System.out.println(x);
		// 후위연산자, 즉 z는 x의 값이 1이 늘어나기 전에 대입이 되어버림 (z=x)
		// 그러나 x는 ++로 1이 늘어남.
		// 그렇다면 z의 값이 13이 되게 하려면 ++z를 하면 되겠지?
		w = ++x;
		System.out.println(w);
		System.out.println(x);
		System.out.println("----------------------");
		// w와 x가 동일한 14가 나옴

		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("계산다음값");
		z = ++x + y++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);

	}

}
