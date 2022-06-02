// 사용자에게 정수 하나를 입력받아서
// 입력 값 -2 ~ +2 범위의 정수를 출력해 보세요.
// 예) 7 -> 5 6 7 8 9

import java.util.Scanner;

public class Inc {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int number = scan.nextInt();
		number -= 2;
		System.out.println(number);
		number++;
		System.out.println(number);
		number++;
		System.out.println(number);
		number++;
		System.out.println(number);
		number++;
		System.out.println(number);
		
		
		
		//----------------------------------------------
		//가장 쉬운식
		
		// System.out.println(number - 2);
		// System.out.println(number - 1);
		// System.out.println(number );
		// System.out.println(number + 1);
		// System.out.println(number + 2);
		
		
		
		
		//-----------------------------------------------
		//이렇게도 가능하다.
		
		// a -= 2;
		// System.out.println(a);
		
		// a += 1;
		// System.out.println(a);
		
		// a += 1;
		// System.out.println(a);
		
		// a += 1;
		// System.out.println(a);
		
		// a += 1;
		// System.out.println(a);
		
		
		//------------------------------------------------
		
		
		
		// a -= 2;
		// System.out.println(a);
		
		// a = 7;
		// System.out.println(--a);
		
		// a = 7;
		// System.out.println(a);
		
		// a = 7;
		// System.out.println(++a);
		
		// a += 1;
		// System.out.println(a);
		
		
		
	}
}