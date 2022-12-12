package Test_11_9th;

public class ConditionalOperator {

	public static void main(String[] args) {
		//삼항연산자
		
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score>80)? 'B' : 'C');
		System.out.println(score+" "+grade);
	}
}

