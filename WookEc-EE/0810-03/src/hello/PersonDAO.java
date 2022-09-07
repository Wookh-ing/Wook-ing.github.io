package hello;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersonDAO {
	// db목록 가져오기 
	public List<Person> getPersonList() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String query = "select * from persons";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Person> list = new ArrayList<>();
		
		try{	
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "root");
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				list.add(new Person(rs.getInt("personId"),rs.getString("name")
						,rs.getInt("age")));
			}
		} finally{
			if(rs != null){
				rs.close();
			}
			if(pstmt != null){
				pstmt.close();
			}
			if(conn != null){
				conn.close();
			}
		}
		return list;
	}
	
	   // db행 추가  
    public void inputPersonList(String name, int age) throws Exception {
       Class.forName("com.mysql.cj.jdbc.Driver");
       String query = "Insert into persons (name, age) values" + 
             "('" + name + "', " + age + ")";
             
       Connection conn = null;
       PreparedStatement pstmt = null;
      
       try{   
          conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "root");
          pstmt = conn.prepareStatement(query);
          int i = pstmt.executeUpdate(query);
          
          
       } finally{
          if(pstmt != null){
             pstmt.close();
          }
          if(conn != null){
             conn.close();
          }
       }
    }

		

}
