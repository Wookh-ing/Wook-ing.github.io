import java.util.Scanner;

public class CircleArea {
	public static void main (String args[]){
		double radius; // 변수 선언 // int = 정수, double = 실수
		double area;
		Scanner input = new Scanner (System.in);
		System.out.print("반지름을 입력하시오: ");
		radius = input.nextDouble();
		area = 3.14 * radius * radius ;
		
		System.out.println(area);
	}
}