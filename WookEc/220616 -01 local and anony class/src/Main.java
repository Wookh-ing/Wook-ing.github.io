interface PrintAll {
	void PrintAll();
}

public class Main {
	public static void main(String[] args) {
		PrintAll a = new PrintAll() {
			
			@Override
			public void PrintAll() {
				System.out.println("출력할게없다");
			}
		};
		a.PrintAll();
		a.PrintAll();
		
//		class Point implements PrintAll {
//		int x;
//		int y;
//		public Point(int x, int y) {
//			this.x = x;
//			this.y = y;
//		}
//		@Override
//		public void printAll() {
//			System.out.println(x);
//			System.out.println(y);
//		}
//	}
//	
//	Point p = new Point(10, 20);
//	p.printAll();
	}
}
