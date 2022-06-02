public class PrimeNumbers {
	
	public static boolean isPrime(int i) {
		int count = 0;
		for (int j = 1; j <= i; j++) {
			if(i % j == 0) {
				count++;
			}
		}
		if (count == 2) {
			return true;
		} else {
			return false; // return은 무조건 한다.
		}
	}
	 
	
	public static void main(String[] args) {
		for (int i = 2; i < 10000; i++){ // 범위 2 ~ 10000
		boolean result = isPrime(i); // 소수인지 알아볼거다 . T/F
		if (result) { // T이면
		System.out.println(i + " 는 소수이다."); // 출력
		}
		}
	}
}