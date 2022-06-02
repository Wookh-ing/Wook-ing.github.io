// 사용자가 입력한 두 개의 숫자를 더해서 출력한다.
import java.util.Scanner; // Scanner 클래스 포함

public class Add2{
	//메인 메소드에서부터 실행이 시작된다.
	public static void main (String args[]){
		Scanner input = new Scanner(System.in); // 사용자로부터 입력을 받기위해 (instance = in) Scanner객체를 생성
		// scanner 떠오는 도구? 누군가가 만들어놓음
		int x; //첫번째 숫자 저장
		int y; //두번째 숫자 저장
		int sum; //합을 저장
		
		System.out.print("첫 번째 숫자를 입력하시오: "); //입력 안내 출력
		x = input.nextInt(); //사용자로부터 첫번째 숫자를 읽는다 (. => 안에있는것을 이용할때)
		
		System.out.print("두 번째 숫자를 입력하시오: "); //입력안내 출력
		y = input.nextInt(); //사용자로부터 두번째 숫자를 읽는다
		
		sum = x + y ; //두개의 숫자를 더한다
		
		System.out.println(sum); //합을 출력한다
	} // 메소드의 끝
	
} //클래스의 끝