// 2 ~ 100 까지의 소수 출력

public class PrimeAll {
	public static void main (String[] args) {
		
		for (int i = 2; i <= 100; i++){
			int count = 0;
			for (int j = 1; j <= 100; j++){
				if (i % j == 0){
					count++;
				}
			} if (count == 2) {
				System.out.println(i + "은 소수입니다.");
			}
		}
	}
}
			
		
		
		 