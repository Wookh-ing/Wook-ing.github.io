package restaurant;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import kr.co.greenart.dbutil.DBUtil;

public class restaurantRepository {
	private restaurant ResultMapping(ResultSet rs) throws SQLException {
		int prime = rs.getInt("prime");
		String tradeName = rs.getString("tradeName");
		String tel = rs.getString("tel");
		String adress = rs.getString("adress");
		
		return new restaurant(prime, tradeName, tel, adress);
	}		
	// add
	public int add(restaurant restaurant) throws SQLException {
		String query = "INSERT INTO restaurant (tradeName, tel, adress) "
				+ "VALUES ('" + restaurant.getTradeName() 
				+ "', '" + restaurant.getTel() 
				+ "', '" + restaurant.getAdress() + "')";
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			
			return stmt.executeUpdate(query);
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
		
		
	}
	// list
	public List<restaurant> list() throws SQLException {
		String query = "SELECT * FROM restaurant";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<restaurant> list = new ArrayList<>();
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				int prime = rs.getInt("prime");
				String tradeName = rs.getString("tradeName");
				String tel = rs.getString("tel");
				String adress = rs.getString("adress");
				
				list.add(new restaurant(prime, tradeName, tel, adress));
			}
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
		return list;
		
	}
	
	// searchTradeName
	public restaurant searchTradeName(String tradeName) throws SQLException {
		String query = "SELECT * FROM restaurant WHERE tradeName = '" + tradeName + "'";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			if (rs.next()) {
				return ResultMapping(rs);
			} else {
				return null;
			}
			
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
	// update
	public int update(restaurant restaurant) throws SQLException {
		String query = "UPDATE restaurant SET tradeName = '" + restaurant.getTradeName()
		+ "', tel = '" + restaurant.getTel()
		+ "', adress = '" + restaurant.getAdress() + "'"
		+ "WHERE prime = " + restaurant.getPrime();
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			
			return stmt.executeUpdate(query);
			
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
	
	// delete
	public int delete(int prime) throws SQLException {
		String query = "DELETE FROM restaurant WHERE prime = " + prime;
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			
			return stmt.executeUpdate(query);
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
}










