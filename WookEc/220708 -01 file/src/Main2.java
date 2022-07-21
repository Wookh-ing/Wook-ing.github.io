import java.io.File;
import java.io.IOException;

public class Main2 {
	public static void main(String[] args) {
		
		// 절대경로 파일 객체 만들기
		File file = new File(".\\");
		
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.exists());
		
		System.out.println(file.getAbsolutePath());
		try {
			System.out.println(file.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 파일 상위폴더
		File fileParent = new File("..\\");
		
		System.out.println(fileParent.getAbsolutePath());
		try {
		System.out.println(fileParent.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// file3에 fileParent를 대입해줬을때 비교하는 객체가 같은 객체인지 확인
		// 결과 = x .이유 = 표현 방식이 다르기 때문이다.
		try {
			File file3 = file.getCanonicalFile().getParentFile();
			System.out.println(file3.getAbsolutePath());
			System.out.println(file3.getCanonicalPath());
			System.out.println(fileParent.equals(file3));
			System.out.println(fileParent.compareTo(file3));
			System.out.println(fileParent.getCanonicalFile().equals(file3));
			System.out.println(fileParent.getCanonicalFile().compareTo(file3));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
