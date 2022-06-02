// 날짜 클래스
// 필드 : 연도, 월, 일
// 메소드(기능) : "2022-05-27"
//				"05/27/22"
//				의 형태로

public class TYearMonthDay {
	
	int Year;
	int Month;
	int Day;
	
	public void printAll() {
		//System.out.println(Year + "-" + Month + "-" + Day);
		System.out.printf("%d-%02d-%02d\n", Year, Month, Day);

	}
	
	public void printAll2() {
		System.out.printf("%02d/%02d/%02d\n", Month, Day, Year % 100);
		// System.out.printf("%02d/%02d/%02d\n", Month, Day, Year); %02d 를 사용해도 네자리 수는 네자리로 나온다.
		// System.out.printf("%02d/%02d/%02d\n", Month, Day, Year % 100);

	}
	
	String getYearTwoDigit() {
		return String.format("%02d/%02d/%02d\n", Month, Day, Year % 100);
	}
}