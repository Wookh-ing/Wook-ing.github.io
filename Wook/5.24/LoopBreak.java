public class LoopBreak {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 5){ 			// i 값이 5가 되었을때
				break;   			// break해라 for문을 깨라. (반복문을 끝낸다.)
			}
			System.out.println(i);
		}
		
		for (int i = 10; i < 20; i++) {
			if (i % 10 == 5) {
				continue;			// 반복문을 종료 시키진 않으나
			}						// 현재 단계를 건너띄게끔.(제시한 조건을 건너띄고 증강식으로.)
			System.out.println(i);
		}
		
		int i = 20;
		while (i < 30) {
			// if (i == 25) {
				// continue;
			// }
			if (i != 25) {
				System.out.println(i);
			i++;					// 증강식을 문장 아래에 만나면 
			}							// 위의 루프가 끝나지 않아 조건에서 무한으로 반복.
		}
			System.out.println("삐빅");
		
	}
}