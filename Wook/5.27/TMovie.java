// 영화
// 제목, 평점, 감독, 발표된 연도
// 모든 값을 콘솔 출력하는 기능

public class TMovie {
	String title;
	double score;
	String director;
	int year;
	
	public TMovie(String t
					, double s
					, String d
					, int p) {
		// 필드 초기화 <<
		title = t;
		score = s;
		director = d;
		year = p;
	}
	//%.xf
	public void printAll() {
		// System.out.println("제목: " + title  + " , " + "평점: " + score + " , " + "감독: " + director + " , " + "출시 연도: " + year);
		
		// System.out.printf("제목: %s\n평점: %.2f\n감독: %s\n출시 연도: %d", title, score, director, year);
		System.out.println("제목: " + title);
		System.out.println("평점: " + score);
		System.out.println("감독: " + director);
		System.out.println("발표연도: " + year);
	}
}
