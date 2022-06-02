import java.util.*;

public class QuerryExcute {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      String id = "nahanju0402";
      String pass = "as1234";
      
      
      boolean isCheck = false;
      
      for (int i = 1; i <= 3 && !isCheck; i++) {
         System.out.print("ID를 입력하세요: ");
         String inputId = scan.nextLine();
         System.out.print("PassWord를 입력하세요: ");
         String inputPass = scan.nextLine();
         
         if (id.equals(inputId) && pass.equals(inputPass)) {
           isCheck= true;
         } 
      }
      if (isCheck) {
         System.out.print("로그인 성공");
      } else {
         System.out.print("로그인 실패");
      }
   }
}