
public class Main3 {
	public static void main(String[] args) {
		try { // 예외가 발생하는 문장
			System.out.println("try 블록 안");
			
			System.out.println("문장 1");
			
			Object o = new Object();
			String s = (String) o;
			
			System.out.println("문장 2");
			
			System.out.println("문장 3");
			
			
		} catch (/*NullPointer*/Exception e) { // 예외를 잡는 문장
			System.out.println("catch 블록 안");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally { // try, catch 블록에서 예외가 발생 하던말던 실행하는 문장
			System.out.println("finally 블록 안");
		}
		
		System.out.println("프로그램 종료");
	}
}
