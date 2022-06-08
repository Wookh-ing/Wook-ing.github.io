import java.util.Random;

public class Histogram {
	private int num;
	private int[] count = new int[10];
	public void getnum() {
	
	
	for (int i = 0; i < 10; i++) {
		num = (int)(Math.random()*100)+1;
		
		if(num <= 10)
			count[0]++;
		else if(num <= 20)
			count[1]++;
		else if(num <= 30)
			count[2]++;
		else if(num <= 40)
			count[3]++;
		else if(num <= 50)
			count[4]++;
		else if(num <= 60)
			count[5]++;
		else if(num <= 70)
			count[6]++;
		else if(num <= 80)
			count[7]++;
		else if(num <= 90)
			count[8]++;
		else if(num <= 100)
			count[9]++;
	}
	}
	
	public void print() {
		System.out.print(" 1  -   10: ");
		star(count[0]);
		System.out.print("11  -   20: ");
		star(count[1]);
		System.out.print("21  -   30: ");
		star(count[2]);
		System.out.print("31  -   40: ");
		star(count[3]);
		System.out.print("41  -   50: ");
		star(count[4]);
		System.out.print("51  -   60: ");
		star(count[5]);
		System.out.print("61  -   70: ");
		star(count[6]);
		System.out.print("71  -   80: ");
		star(count[7]);
		System.out.print("81  -   90: ");
		star(count[8]);
		System.out.print("91  -  100: ");
		star(count[9]);
	}

	public void star(int c) {
		for (int i = 0; i < c; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	



public static void main(String[]args){
		Histogram histo=new Histogram();
		histo.getnum();
		histo.print();
}
}





