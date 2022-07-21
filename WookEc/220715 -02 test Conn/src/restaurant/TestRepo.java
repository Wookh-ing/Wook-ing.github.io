package restaurant;

import java.sql.SQLException;
import java.util.List;

public class TestRepo {
	public static void main(String[] args) {
		restaurantRepository repo = new restaurantRepository();
		
		int result;
		try {
			result = repo.add(new restaurant("바라바라빵", "051-510-1010", "부산광역시 중앙동"));
			System.out.println("추가:" + (result == 1));
			
			List<restaurant> restaurant = repo.list();
			System.out.println(restaurant);
//			List<restaurant> list = repo.list();
//			System.out.println(list);
//			
//			result = repo.update(new restaurant(4, "엄마집", "051-555-5555", "부산광역시 금정구"));
//			System.out.println(result == 1);
			
			
//			restaurant restaurant = repo.searchTradeName("엄마집");
//			System.out.println(restaurant);
			
//			result = repo.delete(4);
//			System.out.println(result == 1);
			
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
