import java.time.LocalDate;
import java.util.Calendar;
public class Main {
// ---- static은 main이 아닌곳에서도 문장을 실행할수있다. 정적,
//		static {
//			System.out.println("스태틱");
//		}
// ---- 그에반해 동적인 것들은 main 안에서 문장을 실행할수있다.
//		public static void main(String[] args) {
//			System.out.println("프로그램 시작");
//			System.out.println("프로그램 종료");
//		}
//}

// ---- java.util.Calendar;
// ---- 캘린더를 사용할때 = new Calender(); 을 사용하면 오류/ 접근을 막아놓음
// ---- 스태틱 메소드를 이용해 인스턴스를 가져온다  = Calendar.getInstance();
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
// ---- ()안에는 정수가 들어간다
// ---- (1 or Calendar.YEAR) - 연도 
// ----	(2 or Calendar.MONTH) + 1 - 월
// ----	(5 or Calendar.DAY_OF_MONTH) - 일
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH) + 1);
		System.out.println(now.get(Calendar.DAY_OF_MONTH));
		System.out.println(now.get(Calendar.DAY_OF_WEEK));
// ---- 켈린더는 시간표현까지가지고 있다
		
		// 1.8ver ~~ java.time.LocalDate;
//		LocalDate now = LocalDate.now();
//		System.out.println(now.getYear());
//		
//		System.out.println(now.getMonthValue());
//		System.out.println(now.getMonth());
//		
//		System.out.println(now.getDayOfMonth());
//		
//		System.out.println(now.getDayOfWeek().getValue());
//		System.out.println(now.getDayOfWeek());
		
	}
}
