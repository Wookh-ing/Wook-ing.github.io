//사용자에게 정수 하나를 입력받아서
//제곱 값을 출력하는 프로그램

//숫자 하나 줬을때 제곱

import java.util.Scanner;

public class Expon{
	public static void main (String args[]){
		System.out.println("제곱 구하기");
		
		Scanner expon = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int x = expon.nextInt();
		
		System.out.println("제곱: "+(x*x));
		System.out.println("세제곱: "+(x*x*x));
		System.out.println("네제곱: "+(x*x*x*x));
		System.out.println("다섯제곱: "+(x*x*x*x*x));
	}
}