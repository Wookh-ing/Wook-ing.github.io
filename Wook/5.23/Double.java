// 2의 제곱 수를 32개 나열하고 결과값을 확인해보세요
// 2 4 8 16 32 64 128 256 512

public class Double {
	public static void main(String[] args) {
		//2의 제곱수 32개 나열하고 
		
		long two = 2;
		
		for (int i = 1; i <= 32; i++) {
			System.out.println("2의 제곱?:" + two);
			two *= 2;
		}
	}
}
