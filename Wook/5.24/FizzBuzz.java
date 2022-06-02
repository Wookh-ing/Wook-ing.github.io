// Fizz Buzz
// 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 Fizz Buzz 16
// 35까지 
// 3의 배수는 Fizz , 5의 배수는 Buzz , 3과 5의 공배수는 Fizz Buzz

import java.util.*;

public class FizzBuzz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i <= 35; i++) {
			int num = i;
			if(num % 15 == 0) {
				System.out.println("fizz buzz");
			} else if (num % 3 == 0) {
				System.out.println("fizz");
			} else if (num % 5 == 0){
				System.out.println("buzz");
			} else {
				System.out.println(num);
			}
	
		}
	}
}
		
		
		// int fizz = 0;
		// int buzz = 0;
		// int a;
		// for (int i = 1; i < 36; i++){
			// fizz = a;
			// if (a == a + 3)
				// System.out.println("Fizz");
			// if (buzz == buzz + 5)
				// System.out.println("Buzz");
		// System.out.println(i);
		// }