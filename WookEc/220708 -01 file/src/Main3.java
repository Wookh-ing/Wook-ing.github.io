import java.io.File;
import java.io.IOException;

public class Main3 {
	public static void main(String[] args) {
		
		// 아래에 설정한 경로
		File file = new File("d:\\WookEc\\filetest");
		System.out.println("있냐? " + file.exists());
		System.out.println("폴더임? " + file.isDirectory());
		System.out.println("파일임? " + file.isFile());
		
//		boolean result = file.mkdir();
//		System.out.println("디랙토리 생성여부: " + result);
		// d드라이브에 file test생성 완료
		
		// d드라이브에 filetest 폴더(디렉토리) 안에 abc 폴더를 생성해보세요
//		File fileABC = new File("d:\\filetest\\abc");
//		fileABC.mkdir();
		
		// abc기준 def라는 파일 만들기
		File file2 = new File("d:\\WookEc\\filetest\\abc\\..\\def");
		file2.mkdir();
		try {
			System.out.println(file2.getAbsolutePath());
			System.out.println(file2.getCanonicalPath());
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		File textFile = new File("d:\\WookEc\\filetest\\mytext.txt");
		try {
			boolean result = textFile.createNewFile();
			System.out.println("생성됨?" + result);
			
		} catch (IOException e) { 
			e.printStackTrace();
		}
		
		
	}
}
