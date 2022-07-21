package restaurant;

import java.awt.image.DataBuffer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import kr.co.greenart.dbutil.DBUtil;

public class RestaurantsDaoImpl implements RestaurantsDao {
	private restaurant ResultMapping(ResultSet rs) throws SQLException {
		int prime = rs.getInt("prime");
		String tradeName = rs.getString("tradeName");
		String tel = rs.getString("tel");
		String adress = rs.getString("adress");

		return new restaurant(prime, tradeName, tel, adress);
	}

	public int[] create(List<restaurant> list) throws SQLException {
		String query = "INSERT INTO restaurant (tradeName, tel, adress) VALUES (?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			
			for (restaurant r : list) {
				pstmt.setString(1, r.getTradeName());
				pstmt.setString(2, r.getTel());
				pstmt.setString(3, r.getAdress());
				pstmt.addBatch();
				
			}
			
			
			return pstmt.executeBatch();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
	}
	
	
	@Override
	public int creat(String tradeName, String tel, String adress) throws SQLException {
		String query = "INSERT INTO restaurant (tradeName, tel, adress) VALUES (?, ?, ?)";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, tradeName);
			pstmt.setString(2, tel);
			pstmt.setString(3, adress);

			return pstmt.executeUpdate();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
	}

	@Override
	public List<restaurant> read() throws SQLException {
		String query = "SELECT * FROM restaurant";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<restaurant> list = new ArrayList<>();
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(ResultMapping(rs));
			}
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
		return list;
	}

	@Override
	public restaurant read(int prime) throws SQLException {
		String query = "SELECT * FROM restaurant WHERE prime = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, prime);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				return ResultMapping(rs);
			}

		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}

		return null;
	}

	@Override
	public int update(int prime, String tradeName, String tel, String adress) throws SQLException {
		String query = "UPDATE restaurant SET tradeName = ?, tel = ?, adress = ? WHERE prime = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, tradeName);
			pstmt.setString(2, tel);
			pstmt.setString(3, adress);
			pstmt.setInt(4, prime);

			return pstmt.executeUpdate();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
	}

	@Override
	public int delete(int id) throws SQLException {
		String query = "DELETE FROM restaurant WHERE prime = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);

			return pstmt.executeUpdate();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
	}
}
