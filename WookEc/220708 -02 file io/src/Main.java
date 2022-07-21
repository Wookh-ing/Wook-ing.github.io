import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		File diaryFile = new File("d:\\WookEc\\filetest\\diary.txt");
//		System.out.println(diaryFile.exists());
//		scanner 은 우리가 입력한 값을 읽기도 하지만
//		가져올 값도 읽어 표시할수있다.
		Scanner scanner = null;

//		try, catch, finally scanner은 설정된 파일과 연결하는것으로 연결 해제해줘야 
//		값을 읽어올수있다. 그러기 위해 try, catch, finally 를 이용하고, 연결해제는 
//		finally에서 scanner.close()를 해줌으로서 끝
		
		try {
			scanner = new Scanner(diaryFile);
			
//			scanner.nextLine(); // > 한줄읽기
			while (scanner.hasNext()) { // > hasNext 다음줄 있는지물어봄
				System.out.println(scanner.nextLine());
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못했습니다.");
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}
