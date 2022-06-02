// 사용자에게 비밀번호를 물어보고 동일할 경우 통과
// 최대 3번의 기회를 줌

import java.util.*;

public class Hanjoo {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      Random random = new Random();
      
      String id = "nahanju0402";
      String pass = "as1234";
      int s = 0;
      
      for (int i = 1; i <= 3; i++) {
      System.out.print("ID를 입력하세요: ");
      String inputId = scan.nextLine();
      System.out.print("PassWord를 입력하세요: ");
      String inputPass = scan.nextLine();
         
         if (id.equals(inputId) && pass.equals(inputPass)) {
            s++;
            break;
         } else {
            continue;
         }
      }
      if (s == 1) {
         System.out.print("로그인 성공");
      } else {
         System.out.print("로그인 실패");
      }
   }
}