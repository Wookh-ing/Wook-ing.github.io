public class StaticVariableAndConst {
	public static void main(String[] args){
		int i = 10;
		
		i++;
		
		final int ASDF; // 초기화 시킬 상수를 모두 대문자로 적을것.
		ASDF = 10;
		// ASDF = 15;
		
		final int MY_NUMBER = 22;
		
		// MY_NUMBER++;
		
		final double PI = 3.14;
		System.out.println(5 * 5 * PI);
	}
}