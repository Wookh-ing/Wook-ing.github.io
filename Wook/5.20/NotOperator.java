public class NotOperator {
	public static void main(String[] args) {
		boolean t = true;
		
		
		t = !t;
		System.out.println(t);
		
		
		!((10 > 3) && (3 == 3)) // fasle
		!(!(10 > 3) || (3 == 3)) // false
		//! (!(true)) or (true))
		//! (false) or (true)
	}
}