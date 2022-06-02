// Fibonacci 수열
// 1 1 2 3 5 8 13 21 34... 
// 초기값 두개를 더하고, 더하고 나온수를 더한 값 반복 
// 100 이하

import java.util.*;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int a = 1;
		int b = 1;
		int c;
		
		System.out.println(a);
		System.out.println(b);
		
		for (int i = 1; i <= 9; i++){
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}
}
/*
		int a = 1;
		int b = 1;
		int c;
		
		System.out.println(a);
		
		while (a <= 100){
			System.out.println(a);
			c = b + a;
			b = a;
			a = c;
		}
*/