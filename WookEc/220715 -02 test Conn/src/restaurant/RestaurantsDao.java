package restaurant;

import java.sql.SQLException;
import java.util.List;

public interface RestaurantsDao {
	int creat(String tradeName, String tel, String adress) throws SQLException;
//	int creat(restaurant restaurant) throws SQLException;
	
	List<restaurant> read() throws SQLException;
	restaurant read(int prime) throws SQLException;
	
	int update(int prime, String tradeName, String tel, String adress) throws SQLException;
	
	int delete(int id) throws SQLException;
	
}
