// (1) (2) (3) (4) (5)
// (5) (5) (3) (2) (1)
// (1) (2) (3) (4) (5)
// (5) (4) (3) (2) (1)
// (1) (2) (3) (4) (5)

public class OneFive {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++){
			if (i % 2 == 0) {
				for (int j = 1; j <= 5; j++){
					System.out.print(" (" + j + ") ");
				}
				System.out.println();
			} else {
				for (int j = 5; j >= 1; j--) {
					System.out.print(" (" + j +") ");
			}
			System.out.println();
			}
		}
	}
}
		
		
		// for (int i = 0; i < 5; i++){
		// if (i % 2 == 0) {
		// System.out.println("(1) (2) (3) (4) (5)");
		// } else {
		// System.out.println("(5) (4) (3) (2) (1)");
		// }
		
		
		// System.out.println("(1) (2) (3) (4) (5)");
		// System.out.println("(5) (4) (3) (2) (1)");
		// System.out.println("(1) (2) (3) (4) (5)");
		// System.out.println("(5) (4) (3) (2) (1)");
		// System.out.println("(1) (2) (3) (4) (5)");