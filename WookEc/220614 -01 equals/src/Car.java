
public class Car {
	private String model;
	public Car(String model) {
		this.model = model;	
		}
	
	public boolean equals(Object obj) {
		if (obj instanceof Car)
			return model.equals(((Car) obj).model);
//		(((Car) obj).model); => 형변환 후 참조 하는것
//		Car otherCar = (Car) obj; 로 표기가능
		else 
			return false;
	}
	
	public static void main(String[] args) {
		Car firstCar = new Car("HMW520");
		Car secondCar = new Car("HMW520");
		System.out.println(firstCar == secondCar);

		//		firstCar.equals(new Scanner(System.in));
		
		if (firstCar.equals(secondCar)) {
			System.out.println("동일한 종류의 자동차입니다.");
		} else {
			System.out.println("동일한 종류의 차가 아닙니다.");
		}
		
	}
}
