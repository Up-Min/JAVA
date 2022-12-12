package study;

import java.util.Scanner;
import java.util.Stack;

public class Bj_10828_time {
	static Stack<Integer> st = new Stack<>();

	static void push(int a) {
		st.push(a);
	}

	static void pop() {
		if (st.empty() == true) {
			System.out.println("-1");
			return;
		}
		System.out.println(st.pop());
	}

	static void size() {
		System.out.println(st.size());
	}

	static void empty() {
		int result = 0;
		if (st.empty() == true) {
			result = 1;
		} else if (st.empty() == false) {
			result = 0;
		}
		System.out.println(result);
	}

	static void top() {
		if (st.empty() == true) {
			System.out.println("-1");
			return;
		}
		System.out.println(st.peek());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int i = 0;

		while (i < a) {
			String b = sc.next();
			switch (b) {
			case "push":
				int j = sc.nextInt();
				push(j);
				i++;
				continue;
			case "pop":
				pop();
				i++;
				continue;
			case "size":
				size();
				i++;
				continue;
			case "empty":
				empty();
				i++;
				continue;
			case "top":
				top();
				i++;
				continue;

			}
		}

	}
}
