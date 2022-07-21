import java.io.File;
import java.io.IOException;

public class Main4 {
	public static void main(String[] args) {
		//d:\파일이름\한글이름.txt
		
		File fileKor = new File("d:\\WookEc\\filetest\\한글이름.txt");
		
//		try {
//			System.out.println("생성됨? " + fileKor.createNewFile());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		// 이름바꾸기
		fileKor.renameTo(new File("d:\\WookEc\\filetest\\newname.txt"));
		
		// 지우기
		File mytext = new File("d:\\WookEc\\filetest\\mytext.txt");
		mytext.delete();
	}
}
