<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>국가 목록</title>
</head>
<body>
<!-- 	<ul>
		<li>국가이름A</li>
		<li>국가이름B</li>
		<li>국가이름C</li>
	</ul>
 -->

<%
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	try {
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
		stmt = conn.createStatement();
		rs = stmt.executeQuery("select name from country");
		
		/* if (rs.next()) {
			int result = rs.getInt(1);
			out.println(result == 1 ? "연결 성공" : "연결 실패");
		} */
		%><ul>
		<%
		while (rs.next()) {
			String name = rs.getString("name");
		%>
		<li><%=name%></li>
		<%
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
%>
		</ul>
</body>
</html>









