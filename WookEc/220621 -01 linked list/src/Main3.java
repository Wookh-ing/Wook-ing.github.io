import java.util.LinkedList;
import java.util.Queue;

public class Main3 {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		
		queue.add("원소");
		queue.offer("원소2");
		
		System.out.println(queue);
		
		String elem1 = queue.poll();
		String elem2 = queue.remove();
		
		System.out.println(elem1);
		System.out.println(elem2);
		
		System.out.println(queue.size());
	}
}
