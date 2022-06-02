import java.util.*;

public class Star6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("별의 최대 개수를 구하시오: ");
		int star = scan.nextInt();
		
		for (int i = 1; i <= star; i++){
			for (int j = star-1; j >= i; j--){
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++){
				System.out.print("★");
			}
			System.out.println();
			}
		}
	}