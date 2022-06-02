// 영화
// 제목, 평점, 감독, 발표된 연도
// 모든 값을 콘솔 출력하는 기능

public class TTestMovie{
	public static void main(String[] args){
		// 생성자(constructor)
		// 기본 생성자
		// 기본값으로 초기화
		// 정수형 -> 0
		// 실수형 -> 0.0
		// 논리형 -> false
		// 참조형 -> null
		
		TMovie mov;
		mov = new TMovie("새영화"
						, 7.5
						, "새감독"
						, 2022);
						
		System.out.println(mov.title);
		System.out.println(mov.score);
		System.out.println(mov.director);
		System.out.println(mov.year);
		
		// mov.title = "기생충";
		// mov.score = 9.89;
		// mov.director = "봉준호";
		// mov.year = 2019;
		
		
		// TMovie mov2 = new TMovie();

		// mov2.title = "랑종";
		// mov2.score = 6.68;
		// mov2.director = "반종 피산 다나쿤";
		// mov2.year = 2021;
		
		// TMovie mov3 = new TMovie();

		// mov3.title = "레전드";
		// mov3.score = 7.52;
		// mov3.director = "브라이언 헬겔랜드";
		// mov3.year = 2015;
		
		// mov.printAll();
		
		// mov2.printAll();
		
		// mov3.printAll();
	}
}