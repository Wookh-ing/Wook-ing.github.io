// 4. 키(실수, m)와 몸무게(실수, kg)를 전달받아
// 한국기준 BMI 지수 (실수)구해 반환하는 메소드.
// BMI = (몸무게) / (키) ^2 
import java.util.*;
public class TBMI {
	
	public static double MKg(double a, double b) {
		double bmi = b / (a * a);
		return bmi;
	}
	
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("키(m)를 입력하세요: ");
		double m = sc.nextDouble();
		
		System.out.println("몸무게(kg)를 입력하세요: ");
		double kg = sc.nextDouble();
		
		double bmi = MKg(m, kg);
		System.out.printf("%.2f",bmi);
		
		
		
	}
}
/*
public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("키(cm)를 입력하세요: ");
		int m = sc.nextInt();
		
		System.out.println("몸무게(kg)를 입력하세요: ");
		double kg = sc.nextInt();
		
		double bmi = MKg(m, kg);
		System.out.println(bmi);
		
		
		
	}
}
*/