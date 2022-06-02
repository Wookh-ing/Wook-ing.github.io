public class TestDog {
	public static void main(String[] args) {
		Dog d = new Dog("댕댕이", "시고르자브종", 5);
		d.printAll();
		
		
		Dog d2 = new Dog("도기도기", "외국물먹은친구", 2);
		d2.printAll();
		
		Dog d3 = new Dog();
		
		d.setName("동동이");
		System.out.println(d.getName());
		
		d.setBreed("삽살개");
		System.out.println(d.getBreed());
		
		d.setAge(2);
		System.out.println(d.getAge());
		//d2.printAll();
		
		Dog d4 = new Dog("댕댕쓰", "시고르잡종");
		System.out.println(d4);
	}
}