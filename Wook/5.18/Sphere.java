// 구의 부피 sphere


import java.util.Scanner;

public class Sphere {
	public static void main (String args[]){
		System.out.println("반지름을 입력해 구의 부피를 구하라");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("구의 반지름은?: ");
		double r = scan.nextDouble();
		double volum = 4.0 / 3.0 * r * r * r;
		
		System.out.println("구의 부피는: " + volum + "^3");
		
	}
}