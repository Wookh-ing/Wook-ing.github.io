import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



class Diary implements Comparable<Diary>{
	private int date;
	private String title;
	private String weather;
	private String content;
	
	public Diary(int date, String title, String weather, String content) {
		this.date = date;
		this.title = title;
		this.weather = weather;
		this.content = content;
	}

	public int getDate() {
		return date;
	}

	public String getTitle() {
		return title;
	}

	public String getWeather() {
		return weather;
	}

	public String getContent() {
		return content;
	}

	@Override
	public String toString() {
		return "Diary [date=" + date + ", title=" + title + ", weather=" + weather + ", content=" + content + "]";
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Diary)) {
			return false;
		}
		Diary other = (Diary) obj;
		if (content == null) {
			if (other.content != null) {
				return false;
			}
		} else if (!content.equals(other.content)) {
			return false;
		}
		if (date != other.date) {
			return false;
		}
		if (title == null) {
			if (other.title != null) {
				return false;
			}
		} else if (!title.equals(other.title)) {
			return false;
		}
		if (weather == null) {
			if (other.weather != null) {
				return false;
			}
		} else if (!weather.equals(other.weather)) {
			return false;
		}
		return true;
	}
	
	
	
	@Override
	public int compareTo(Diary o) {
		// TODO Auto-generated method stub
		return date - o.date;
	}
	
	

	
	
	
}

// 일기 관리 프로그램
// 일기 (날짜, 제목, 날씨, 내용 ...)




public class Main {
	public static void main(String[] args) {
		Diary d1 = new Diary(220622, "일기2", "더움", "더웠고, 학원을 마치고 잠드니 다음날이었다");
		Diary d2 = new Diary(220621, "일기2", "더움", "더웠고, 학원을 마치고 잠드니 다음날이었다dfdf");
		Diary d3 = new Diary(220620, "일기1", "더움", "더웠고, 학원을 마치고 잠드니 다음날이었다asdfasdf");
		
		List<Diary> diary = new ArrayList<>();
		
// 1. 일기 등록
// 같은 일자에는 일기 중복 불가
		
		diary.add(d1);
		diary.add(d2);
		diary.add(d3);
		
		System.out.println(diary);
		diary.set(1, new Diary(220625, "일기러기", "개더움", "일기안쓴지오백만년"));
		
// 2. 일기 목록 출력
// 날짜 순		
		Comparator<Diary> comparator = new Comparator<Diary>() {
			@Override
			public int compare(Diary o1, Diary o2) {
				// TODO Auto-generated method stub
				return o1.getDate() - o2.getDate();
			}
			
		};
		
		Collections.sort(diary, comparator);
		System.out.println("\n" + diary);
		
// 내용 길이 순
		
		
		
// 날짜를 선택해서 해당 일기 내용을 수정 가능
		
// 삭제 - 오래된 일기
		diary.remove(0);
		System.out.println(diary);
		
		diary.remove(0);
		System.out.println(diary);
	}

	
}
