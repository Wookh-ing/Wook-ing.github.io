// 사용자가 입력한 정수가 소수임을 확인하여 출력하는 프로그램. (약수가 1과 자지가신으로 나뉘는 수)
import java.util.*;

public class PrimeNumber {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사용자 입력 정수: ");
		int type = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= type; i++){
			if (type % i == 0) {
				count++;
			}
		} if (count == 2) {
			System.out.println(type + "은 소수입니다.");
		} else {
			System.out.println(type + "은 소수가 아닙니다.");
		}
		
	}
}
		