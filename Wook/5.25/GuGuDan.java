// 구구단
// 4단

public class GuGuDan {
	public static void main(String[] args) {
		for (int j = 2;  j < 10; j++){
			for(int i = 1; i < 10; i++ ){
				System.out.printf("%d * %d = %d\n", j, i, j*i);
			}
		}
	}
}