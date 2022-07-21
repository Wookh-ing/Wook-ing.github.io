package restaurant;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

public class TestRestaurantsDao {
	public static void main(String[] args) {
		RestaurantsDao dao = new RestaurantsDaoImpl();
		
		try {
//			int result = dao.creat("test", "1111-1111", "부산");
//			System.out.println(result == 1);
			
//			System.out.println(dao.read());
		
			
//			int result = dao.update(5, "스까쓰", "051-555-9999", "전포동");
//			System.out.println(result == 1);
//			System.out.println(dao.read(5));
			
//			int result = dao.delete(2);
//			System.out.println(result == 1);
//			System.out.println(dao.read(2));
			// 위는 다른 테이블이 참조 하고있는 외래 키를 가지고 있어서 삭제가 불가능하다!
			
			RestaurantsDaoImpl impl = (RestaurantsDaoImpl) dao;
			int[] result = impl.create(Arrays.asList(
					new restaurant(0, "배치1", "010-1", "배치주소1"),
					new restaurant(0, "배치2", "010-2", "배치주소2"),
					new restaurant(0, "배치3", "010-3", "배치주소3"),
					new restaurant(0, "배치4", "010-4", "배치주소4")
					));
			System.out.println(Arrays.toString(result));
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
