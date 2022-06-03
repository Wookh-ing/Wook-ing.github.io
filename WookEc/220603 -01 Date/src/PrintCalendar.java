/*
달력 모양 출력
 */




import java.util.Calendar;
import java.util.Scanner;

public class PrintCalendar {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		
		// 배열 index는 0에서 부터 시작
		String []weeks = {"일", "월", "화", "수", "목", "금", "토"};
//		int year = 2022;
//		int month = 7;
		
		 System.out.println("년도를 입력하세요: ");
		 int year = sc.nextInt();
		 System.out.println("월을 입력하세요: ");
		 int month = sc.nextInt();
		
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		
		// 해당월 1일의 요일을 알려줌
		cal.set(cal.get(Calendar.YEAR),
				cal.get(Calendar.MONTH),
				1);
		
		cal.get(Calendar.DATE);
		//
		System.out.println("---------["+year+"년 "+month+"월]---------");
		System.out.println(" 일      월      화      수      목     금      토");
		
		// cal에 정해둔다(연도, 월, 일)
		// month는 0에서부터 1월이 시작되므로 -1을 해줘야 원하는 값 도출가능
		// 혹은 내가 도출하고자 하는 월 -1 한 값을 대입해줘도 된다.
		cal.set(year,month-1,1);
		
		// getActualMaximum > Calendar에서특정월의 마지막 날짜를 구하는 예제
		// getMaximum > Calendar이 가직 최대수 : 31일
		int end = cal.getActualMaximum(Calendar.DATE);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		
		for(int i = 1; i <= end; i++) {
			if(i == 1) {
				for(int j = 1; j < dayOfWeek; j++) {
					System.out.print("    ");;
				}
			} if (i < 10) {
				System.out.print(" ");
			}
			System.out.print(" "+i+" ");
			
			if (dayOfWeek%7 == 0) {
				System.out.println();
			}
			dayOfWeek++;
		}
		System.out.println("\n-----------------------------");
		// 해당월 1일의 요일을 알려줌
		// 아래에서 -1을 해주는 이유는
		// 배열 index는 0에서 시작하는 반면
		// 배열 값을 받아온 요일은 1부터 시작하기때문에
		// -1을 해주어야 값이 맞게나온다.
		// 1을 넣어줬을시 해당 시작일 다음날에서 부터 시작한다.
		System.out.println(weeks[cal.get(Calendar.DAY_OF_WEEK)-1]);
		
		// 마지막 일(getActualMaximum)
		System.out.println(end);
	}
}
				

