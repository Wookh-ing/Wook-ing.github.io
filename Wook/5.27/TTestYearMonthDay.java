// 날짜 클래스
// 필드 : 연도, 월, 일
// 메소드(기능) : "2022-05-27"
//				"05/27/22"
//				의 형태로

public class TTestYearMonthDay{
	public static void main(String[] args) {
	TYearMonthDay YMD;
	YMD = new TYearMonthDay();
	// TYearMonthDay YMD = new TYearMonthDay;
	
	YMD.Year = 2022;
	YMD.Month = 05;
	YMD.Day = 27;
	
	YMD.printAll();
	YMD.printAll2();
	
	String getYearTwoDigit = YMD.getYearTwoDigit();
	System.out.println(getYearTwoDigit);
	}
}
	