<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
/* DB연결
   SELECT*/

	// 라이브러리에 드라이버 넣기
	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	List<String> list = new ArrayList<>();
	try {
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
		stmt = conn.createStatement();
		rs = stmt.executeQuery("select distinct continent from country");
		
		while (rs.next()) {
			String continent = rs.getString("continent");
			list.add(continent);
		}
	} finally {
		if (rs != null) {
			rs.close();
		}
		if (stmt != null) {
			stmt.close();
		}
		if (conn != null) {
			conn.close();
		}
	}
	// request 객체에 list 를 attribute로 설정하기
	request.setAttribute("continent", list);
	// 다음페이지로 forward 시키기.
	request.getRequestDispatcher("searchform.jsp")
		.forward(request, response);
	
	
%>