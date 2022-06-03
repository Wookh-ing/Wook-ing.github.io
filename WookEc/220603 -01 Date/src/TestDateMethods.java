import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;


//class Tomorrow {
//	private String tomorrow;
//
//	public Tomorrow(String tomorrow) {
//		this.tomorrow = tomorrow;
//	}
//	
//	public Tomorrow() {
//	
//	}
//	
//	public String getTomorrow() {
//		return tomorrow;
//	}
//
//	public void setTomorrow(String tomorrow) {
//		this.tomorrow = tomorrow;
//	}
//	
//	public void tomorrow() {
//		System.out.println(Calendar.YEAR);
//		System.out.println((Calendar.MONTH) + 1);
//		System.out.println((Calendar.DAY_OF_MONTH));
//		System.out.println((Calendar.DAY_OF_WEEK));
//	}
//	
//	
//}

//Tomorrow tom = new Tomorrow();
public class TestDateMethods {
	public static void main(String[] args) {
		// 내일의 날짜 객체
		
		
//	 	캘린더로 만들기
		Calendar now = Calendar.getInstance();
		// 오늘
		// now.set(2022, Calendar.JUNE, 3);
		// 내일
		now.add(Calendar.DAY_OF_MONTH, 1);
		
		Date date = now.getTime();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String result = dateFormat.format(date);
		System.out.println(result);
		
//		LocalDate로 만들기
//		LocalDate now = LocalDate.now();
//		LocalDate nowPlusOne = now.plusDays(1);
//		LocalDate tomorrow = LocalDate.of(2022, 6, 4);
//		System.out.println(tomorrow.equals(nowPlusOne));
		
	}

}
