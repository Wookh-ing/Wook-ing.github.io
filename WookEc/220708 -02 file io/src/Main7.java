import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main7 {
	public static void main(String[] args) {
		Map<Integer, Set<Integer>> lotto = new LinkedHashMap<>();
		
		lotto.put(1000, new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)));
		lotto.put(1001, new HashSet<Integer>(Arrays.asList(7, 8, 9, 10, 11, 12)));
		lotto.put(1002, new HashSet<Integer>(Arrays.asList(13, 14, 15, 16, 17, 18)));
		
		System.out.println(lotto);
		
		
		
		// lotto.txt 출력
		// 1000 : [1, 2, 3, 4, 5, 6]
		// 1001 : [7, 8, 9, 10, 11, 12]
		// 1002 : [13, 14, 15, 16, 17, 18]
		// setToString()
		
		
		
		
		File lottoFile = new File("d:\\WookEc\\filetest\\lotto.txt");
		
		
		
		
		try {
			lottoFile.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		PrintWriter pw = null;
		try {
//			pw = new PrintWriter(new FileWriter(lottoFile));
//			for (int i = 1000; i <= 1002; i++) {
//				pw.println(i + "번째 로또번호: " + lotto.get(i));
//			}
			pw = new PrintWriter(lottoFile);
			Set<Integer> keySet = lotto.keySet();
			for (Integer i : keySet) {
				pw.println(i + " : " + lotto.get(i));
			}
//			pw.println("1000: " + lotto.get(1000));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			pw.close();
		}
		
		PrintWriter pw2 = null;
		try {
			pw2 = new PrintWriter(new FileWriter(lottoFile, true));
			pw2.println("새 번호 : 20, 22, 24, 26, 28, 30");
		} catch (IOException e) {
			
		} finally {
			pw2.close();
		}
		
	}
}
