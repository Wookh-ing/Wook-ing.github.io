package Safari;
//동물원 관리

//동물 - 종, 나이, 무게
//필드, 생성자, 게터세터

//직원 - 역할(조련사, 경영 ...), 이름
//필드, 생성자, 게터세터
//역할을 나눈다?


//조련사는 동물을 1마리씩만 담당합니다.


//동물은 육식/ 초식으로 나누어서 관리
//주식으로 분류하여 동물 목록을 볼 수 있음.
//조련사 담당에 따라 동물 목록을 볼 수 있음. (담당이 없는 동물도 볼 수 있어야함)
public class Test {
	public static void main(String[] args) {
		Meat[] m = new Meat[3];
		Meat m1 = new Meat("사자", 5, 100, "고기", "육식동물");
		Meat m2 = new Meat("호랑이", 10, 200, "고기", "육식동물");
		Meat m3 = new Meat("고양이", 2, 6, "고기", "육식동물");
		
		Vegetarian[] v = new Vegetarian[2];
		Vegetarian v1 = new Vegetarian("코알라", 2, 30, "풀", "초식동물");
		Vegetarian v2 = new Vegetarian("토끼", 5, 8, "풀", "초식동물");
		Vegetarian v3 = new Vegetarian("판다", 5, 300, "풀", "초식동물");
		
		Staff[] s = new Staff[6];
		Staff s1 = new Staff("정욱1", "사육사");
		Staff s2 = new Staff("정욱2", "사육사");
		Staff s3 = new Staff("정욱3", "사육사");
		Staff s4 = new Staff("정욱4", "사육사");
		Staff s5 = new Staff("정욱5", "사육사");
		Staff s6 = new Staff("정욱6", "경영 & 관리");
		
//		for(int i = 0; i < v.length; i++) {
//			}
		System.out.println("----------육식동물 목록 출력----------");
		if (m1.getSpecies().equals(m2.getSpecies()) && m2.getSpecies().equals(m3.getSpecies())) {
			System.out.println(m1.toString() + "\n" + m2.toString() + "\n" + m3.toString());
		}
		System.out.println();
		System.out.println("----------초식동물 목록 출력----------");
		if (v1.getSpecies().equals(v2.getSpecies())) {
			System.out.println(v1.toString() + "\n" + v2.toString());
			}
		
		System.out.println();
		System.out.println("----------사육사별 관리 동물 출력----------");
		if (s1.getPart() == "사육사") {
			System.out.println(m1.toString() + ", 담당 사육사: " + s1.toString());
		} if (s2.getPart() == "사육사") {
			System.out.println(m2.toString() + ", 담당 사육사: " + s2.toString());
		} if (s3.getPart() == "사육사") {
			System.out.println(m3.toString() + ", 담당 사육사: " + s3.toString());
		} if (s4.getPart() == "사육사") {
			System.out.println(v1.toString() + ", 담당 사육사: " + s4.toString());
		} if (s5.getPart() == "사육사") {
			System.out.println(v2.toString() + ", 담당 사육사: " + s5.toString());
		}
		System.out.println();
		System.out.println("----------관리자----------");
		if (s6.getPart() == "경영 & 관리") {
			System.out.println(s6.toString());
		}

//		System.out.println(v1.getSpecies().equals(v2.getSpecies()));
				
			
		



		
	}
}
