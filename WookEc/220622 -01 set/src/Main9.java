import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;




public class Main9 {
	public static void main(String[] args) {
		Book b1 = new Book("책1", 5000);
		Book b2 = new Book("책1", 5000);
		Book b3 = new Book("책2", 7000);
		Book b4 = new Book("책3", 4000);
		
//		Set<Book> tree = new TreeSet<>();
//		tree.add(b1);
//		tree.add(b2);
//		tree.add(b3);
//		tree.add(b4);
//		
//		System.out.println(tree);
		
		Comparator<Book> com = new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				return o1.getPrice() - o2.getPrice();
			}
		};
		
		
		Set<Book> treeByPrice = new TreeSet<>();
		treeByPrice.add(b1);
		treeByPrice.add(b2);
		treeByPrice.add(b3);
		treeByPrice.add(b4);
		
		System.out.println(treeByPrice);
		
	}
}
