import java.util.Scanner;

// 회원 관리 프로그램

// 회원
// 이름
// 키
// 몸무게

// BMI 지수
// BMI = 몸무게(kg) / 키^2(m)
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member[] memberlist = new Member[10];
		int input = 0;
		int cnt = 0;

		System.out.println("-회원 관리 프로그램-");
		while (input != 4) {
			System.out.printf("1.%s\n2.%s\n3.%s\n4.%s\n", "회원등록", "회원명부", "회원별 BMI", "프로그램 종료");
			System.out.println("무엇을 실행하겠습니까: ");
			input = sc.nextInt();

			while (true) {
				if (input == 1 && cnt < 10) {
					String name;
					double height;
					int weight;

					System.out.print(String.format("%d번 회원의 이름 입력: ", cnt + 1));
					name = sc.next();
					System.out.print(String.format("%d번 회원의 키 입력(m단위): ", cnt + 1));
					height = sc.nextDouble();
					System.out.print(String.format("%d번 회원의 몸무게 입력: ", cnt + 1));
					weight = sc.nextInt();

					for (int i = 0; i < 10; i++) {
						if (memberlist[i] == null) {
							memberlist[i] = new Member(name, height, weight);
							cnt++;

							for (int j = 0; j < i; j++) {
								if (memberlist[j].equals(memberlist[i])) {
									memberlist[i] = null;
									cnt--;

									System.out.print(String.format("%d번째 신규회원 등록 실패 ", cnt + 1));
									System.out.print(String.format("사유: " + "%d번째 회원가 정보가 같습니다 ", j + 1));
									break;
								}
							}
							break;
						}
					}
					System.out.println("< " + cnt + "명 등록완료" + (10 - cnt) + "명 남았습니다." + " 최대 10명");

					System.out.println("1.추가등록                   2.등록종료");
					int b = sc.nextInt();
					if (b == 2) {
						break;
					}
				}
				if (input == 2) {
					System.out.println("----------회원목록----------");
					for (int i = 0; i < 10; i++) {
						if (memberlist[i] != null) {
							System.out.println(memberlist[i].toString());
						}
					}
					System.out.println("1.목록                   2.프로그램 종료");
					int b = sc.nextInt();

					if (b == 2) {
						System.out.println("프로그램을 종료합니다");
					}
				} else if (input == 3) {
					System.out.println("----------회원별 BMI----------");
					for (int i = 0; i < 10; i++) {
						System.out.println(memberlist[i].printBmi());
						
					}
					System.out.println("1.목록                   2.프로그램 종료");
					int b = sc.nextInt();
					
					if (b == 2) {
						System.out.println("프로그램을 종료합니다.");
					}
				} else if (input == 4) {
					break;
				}
			}

		}
	}
}
