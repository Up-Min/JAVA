package test_12_2nd_vector;

import java.util.Stack;
// First In First Out, FIFO.
// Use Stack.
public class Stack_ex {
	public static void main(String[] args) {
		// declare Stack
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(10));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(500));
		// input : 10 -> 50 -> 100 -> 500
		// output : 10 -> 50 -> 100 -> 500
		
		while(!coinBox.isEmpty()) {
			// repeat until coinbox is empty
			Coin coin = coinBox.pop();
			System.out.println("poped coin : " + coin.getValue());
		}
	}
}
