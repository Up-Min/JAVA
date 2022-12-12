package study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Bj_10828 {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static Stack<Integer> st = new Stack<>();

	static void push(int a) throws IOException {
		st.push(a);
		System.out.println(st);
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

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()); 
		Scanner sc = new Scanner (System.in);
		bw.write(a);
		int i = 0;

		while (i < a) {
			String b = sc.nextLine();
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
