package Diary;
import java.time.LocalDate;

public class TestDiary {
	public static void main(String[] args) {
		Diary d1 = new Diary(LocalDate.of(2022, 6, 1), "소바를 먹었다", "흐림", "지각했다.");
		d1.setWeather("맑음");
		
		System.out.println(d1.getWeather());
		
		System.out.println(d1);
		
		Diary d2 = new Diary(LocalDate.of(2022, 6, 1), "다른제목", "맑음", "다른내용");
		
		System.out.println(d1.equals(d2));
		System.out.println(d1.compareTo(d2));
		
		
	}
}
