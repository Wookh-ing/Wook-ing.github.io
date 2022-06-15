package 멤버;

public class memcopy {
	public class Member {
		   private String name;      // 이름
		   private double height;    // 키
		   private double weight;    // 몸무게
		   private double bmi;      //bmi 지수 
		   private String note;   //bmi 결과 
		   
		   
		   public Member(String name, double height, double weight)
		   {
		      this.name = name;
		      this.height = height;
		      this.weight = weight;
		      this.bmi = getBmi();    //getBmi메서드를 호출하여 return값을 인스턴스의 bmi값에 저장.
		      this.note = getNote();   //getNote메서드를 호출하여 return값을 인스턴스의 note값에 저장.
		   }
		   
		   public String getNote() { //BMI 지수에 따라 결과 값을 리턴.
		      if(35 <= this.bmi) return "고도비만(3단계 비만)";
		      else if(30 <= this.bmi) return "중도비만 (2단계 비만)";
		      else if(25 <= this.bmi) return "경도비만 (1단계 비만)";
		      else if(23 <= this.bmi) return "과체중";
		      else if(18.5 <= this.bmi && this.bmi < 23) return "정상";
		      else return "저체중";
		      
		   }
		   public double getBmi() { //BMI 공식 == ( 몸무게 / 키^2 )
		      return  Math.round((weight/((height) * (height))) * 100) / 100.0;  //Math.round()는 반올림 할 때 사용하는 메서드
		                                                         //double a = 22.2141 이라고 가정. ->  a * 100의 값은 2221.41의 소수 첫째 자리에서 반올림하여
		                                                         // 22.21이 되는데 이 값을 또 100.0으로 나누면 22.21이 되므로 소수 둘 째자리까지 표현이 가능하다.
		                                                         // 100이 아닌 100.0으로 나눠주는 이유 반환형의 타입이 double;
		   }





		   
		   
		   //만약 신규 회원의 이름, 키, 몸무게가 어떤 회원의 이름, 키, 몸무게와 같다면 신규 회원 등록 불가
		   public boolean equals(Object obj) {
		      if(obj instanceof Member) {
		         Member temp = (Member) obj;
		         return name.equals(temp.name) && height == temp.height && weight == temp.weight;
		               
		      }else {
		         return false;
		      }
		   }
		   
		   public String getName() {
		      return name;
		   }
		   public void setName(String name) {
		      this.name = name;
		   }
		   public double getHeight() {
		      return height;
		   }
		   public void setHeight(double height) {
		      this.height = height;
		   }
		   public double getWeight() {
		      return weight;
		   }
		   public void setWeight(double weight) {
		      this.weight = weight;
		   }
		   
		   

		   public String PrintAll() { //순서대로 이름 , 키 , 몸무게 , bmi지수, bmi 결과값을 리턴.
		      // TODO Auto-generated method stub
		      return this.name + "\t" + this.height + "\t" + this.weight + "\t\t" + this.bmi + "\t" + this.note;
		   }
		   
		   
		}
}
import java.util.Scanner;
/* 손흥민 1.83 77     정상
   황의조 1.85 82     과체중
   백승호 1.82 72     정상
   강호동 1.82 136      고도비만  (전성기 시절)
   멸치 1.9 58    저체중
   
*/

public class MemberTest {
   Scanner sc = new Scanner(System.in); // 값을 입력 받기 위하여 Scanner 사용
   Member[] members = new Member[10]; // 최대 10명의 회원까지 저장할 수 있는 members변수 선언.
   int selectNumber = 0; //여러개의 선택지에서 사용됨.
   int count = 0; // 신규 회원 한 명씩 등록 될때 마다 count++; 할 예정
               //  count 값 == 등록된 회원 수
   
   public MemberTest(){ //생성자 
      run(); // 주요 기능을 담당하는 run()메소드 호출
   }
   
   
   public void run() {
      while(true) {
         if(selectNumber == 2) {
            break;
         }
         
         System.out.println("                                                  ");
         System.out.println("=====================목록=========================");
         System.out.println("1. 신규 회원 등록");
         System.out.println("2. 회원 목록");
         System.out.println("3. 나도 정상이 되고싶어");
         System.out.println("4. 종료");
         System.out.println("=================================================");
         System.out.println("                                                  ");
         
         selectNumber = Integer.parseInt(getData("번호 입력 : "));
         
         System.out.println();
         
         if(selectNumber == 1) {
            registerMember(); // 회원 등록하는 함수로 이동
         }else if(selectNumber == 2) {
            memberList(); // 등록된 회원 목록을 볼 수 있는 함수로 이동
         }else if(selectNumber == 3){
            wantNomal(); 
         }else if(selectNumber == 4) {
             System.out.println("\n <도서 관리 프로그램을 종료합니다.>");
             break;
          }else {
             System.out.println("<범위에 없는 목록 번호를 입력하셨습니다.>");
             System.out.println("<다시 입력해주세요.>");
          }
      }
      
   }
   
   // 등록된 회원 목록을 볼 수 있는 함수
   private void memberList() { 
       System.out.println("                                                  ");
       System.out.println("=================================================");
        System.out.println("                  회원목록");
        System.out.println("이름\t키(m)\t몸무게(kg)\tbmi\t비고");
       System.out.println("=================================================");
   
        for(int i = 0; i < 10; i++) {
           if(members[i] != null) { // numbers[i]에 등록된 회원이 있다면
              System.out.println(members[i].PrintAll()); //그 회원의 이름, 키, 몸무게, bmi지수, bmi결과 를 출력
           }
        }                     //numbers[i]에 등록된 회원이 없다면 넘어감.
        
       System.out.println("=================================================");   // 등록된 회원들을 다 출력했다면     
        System.out.println("1.목록   2.프로그램 종료"); //목록으로 돌아갈지 프로그램을 종료할지 선택지가 주어짐.
        
        selectNumber = Integer.parseInt(getData("번호입력 : "));
      
       if(selectNumber == 2) {
         System.out.println("프로그램을 종료합니다.");
        
      }
   }


   private void registerMember() {

      
      boolean a = true;
       while(a) {
          // 위에 count가 0부터 시작했으므로 
         String name = getData((count +  1) +"번째 신규 회원의 이름을 입력해주세요");
         double height = Double.parseDouble(getData( (count +  1) + "번째 신규 회원의 키를 입력해주세요"));
         double weight =  Double.parseDouble(getData( (count +  1) +"번째 신규 회원의 몸무게를 입력해주세요"));
         
         for(int i = 0; i < 10; i++) {
            
 
            if(members[i] == null) { //만약 members[i]에 저장된 회원이 없다면
               members[i] = new Member(name, height, weight); // 그자리에 N번째 회원의 이름 , 키 , 몸무게를 저장
               count++; // 신규 회원이 등록 되었으니 count++;
               
               for(int k = 0; k < i; k++) { // 이중 반복문을 통하여 기존 회원과 이름, 키, 몸무게가 같은지 확인 할 예정
                  
                  if(members[k].equals(members[i])) { //기존 회원과 이름, 키, 몸무게가 같다면
                     members[i] = null; //등록했던 신규 회원을 취소
                     count--; //등록했던 신규 회원을 취소했으니 다시 count--;
                     
                     
                     System.out.println("-----------------------------------------------");
                     System.out.println((count + 1) + "번째 신규 회원의 등록이 완료 되지 않았습니다.");
                     System.out.println("사유 : "  + (k + 1) + "번째 회원과 같은 이름, 키 , 몸무게입니다.");
                     System.out.println("-----------------------------------------------");
                              break;
                  }
                     
                  
                  
               }
               
               break;
               
            }
         }
         
         
         System.out.println("< " + count + "명 등록완료" + "                        " + (10 - count) + " 명 남았습니다.(최대 10명) >");   
         int b = Integer.parseInt(getData("1. 추가 등록      2. 등록 종료"));
         if(b == 2) {
            break;         
         }
            
       }
      
      
   }
   
   private void wantNomal() {
      System.out.println("------------------------------------------------------");
      System.out.println("1.고도비만 | 2.중도비만 | 3.경도비만 | 4.과체중 | 5.정상 | 6.저체중");
      System.out.println("------------------------------------------------------");
      
      
      for(int i = 0 ; i < members.length; i++) {
         if(members[i] != null) {
            if(members[i].getNote().equals("고도비만(3단계 비만)")) {
               System.out.println("  " + members[i].getName());
            }else if(members[i].getNote().equals("중도비만 (2단계 비만)")) {
               System.out.println("\t\t   " + members[i].getName());
            }else if(members[i].getNote().equals("경도비만 (1단계 비만)")) {
               System.out.println("\t\t\t   " + members[i].getName());
            }else if(members[i].getNote().equals("과체중")) {
               System.out.println("\t\t\t\t " + members[i].getName());
            }else if(members[i].getNote().equals("정상")) {
               System.out.println("\t\t\t\t\t " + members[i].getName());
            }else if(members[i].getNote().equals("저체중")) {
               System.out.println("\t\t\t\t\t\t " + members[i].getName());
            }         
         }
      }
      
      selectNumber = Integer.parseInt(getData("<  정상으로 바꾸고싶은 번호 입력   >"));

      switch(selectNumber) {
         case 1: nomalCal(1);
               break;
         case 2: nomalCal(2);
               break;
         case 3: nomalCal(3);
               break;
         case 4: nomalCal(4);
               break;
         case 5: System.out.println("이미 bmi지수가 정상입니다.");
               break;
         case 6: nomalCal(6);
               break;
      }
      System.out.println("------------------------------------------------------");
        System.out.println("1.목록   2.프로그램 종료");
        
        selectNumber = Integer.parseInt(getData("번호입력 : "));
      if(selectNumber == 2) {
         System.out.println("프로그램을 종료합니다.");
      }
   }

   private void nomalCal(int index) {
      String note[] = {"0", "고도비만(3단계 비만)", "중도비만 (2단계 비만)", "경도비만 (1단계 비만)", 
            "과체중", "정상", "저체중"};
      int cnt = 0;
      for(int i = 0; i < members.length; i++) {
         double normalWeight = 0;
         double normalHeight = 0;
         if(members[i] != null) {
            if(members[i].getNote().equals(note[index])) {
               cnt++;
               normalWeight = 20 * members[i].getHeight() * members[i].getHeight();
               normalHeight = Math.sqrt(members[i].getWeight() / 20);
               if(index == 6) {
                  System.out.println(members[i].getName() + "님은 bmi가 정상이 되려면 살을 " + String.format("%.2f",Math.abs(members[i].getWeight() - normalWeight)) + "kg 증량 하시거나 키를 " + String.format("%.2f",   Math.abs((normalHeight - members[i].getHeight())) * 100)+ "cm 더 줄이십시오.");
               }else {
                  System.out.println(members[i].getName() + "님은 bmi가 정상이 되려면 살을 " + String.format("%.2f",members[i].getWeight() - normalWeight) + "kg 감량 하시거나 키를 " + String.format("%.2f",   (normalHeight - members[i].getHeight()) * 100)+ "cm 더 키우십시오.");
               }
            }   
         }
      }
      if(cnt == 0) {
         System.out.println("해당하는 인원이 없습니다.");
         System.out.println("------------------------------------------------------");
      }
   
   }

   private String getData(String Message) {
      System.out.println(Message);
      return sc.next();
   }


   public static void main(String[] args) {
   
      new MemberTest();
      
   }

}