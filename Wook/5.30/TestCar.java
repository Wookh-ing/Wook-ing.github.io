public class TestCar {
	public static void main(String[] args) {
		Car c = new Car("green", 10, 1);
		c.printAll();
		
		Car c2 = new Car("yellow");
		c2.printAll();
		
		Car c3 = new Car("red");
		c3.printAll();
		
		// c.color = "빨강";
		// System.out.println(c.color);
		
		c.setColor("빨강");
		System.out.println(c.getColor());
		
		c.setSpeed(100);
		System.out.println(c.getSpeed());
		
		c.setGear(5);
		System.out.println(c.getGear());
	}
}