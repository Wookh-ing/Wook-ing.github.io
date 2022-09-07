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
	List<Integer> list1 = new ArrayList<>();
	try {
		String country = request.getParameter("country");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
		stmt = conn.createStatement();
		if (country.equals(country)) {
			rs = stmt.executeQuery("select name, population from country where continent = '"+ country +"' order by Population desc");
		} /* else if (country.equals("South America")) {
			rs = stmt.executeQuery("select name, population from country where continent = 'South America' order by Population desc");
		} else if (country.equals("Asia")) {
			rs = stmt.executeQuery("select name, population from country where continent = 'Asia' order by Population desc");
		} else if (country.equals("Africa")) {
			rs = stmt.executeQuery("select name, population from country where continent = 'Africa' order by Population desc");
		} else if (country.equals("Europe")) {
			rs = stmt.executeQuery("select name, population from country where continent = 'Europe' order by Population desc");
		} else if (country.equals("Oceania")) {
			rs = stmt.executeQuery("select name, population from country where continent = 'Oceania' order by Population desc");
		} else if (country.equals("Antarctica")) {
			rs = stmt.executeQuery("select name, population from country where continent = 'Antarctica' order by Population desc");
		} */
		
		while (rs.next()) {
			String name = rs.getString("name");
			list.add(name);
			int population = rs.getInt("population");
			list1.add(population);
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
	request.setAttribute("countries", list);
	request.setAttribute("countries1", list1);
	// 다음페이지로 forward 시키기.
	request.getRequestDispatcher("viewWorld.jsp")
		.forward(request, response);
	
	
%>