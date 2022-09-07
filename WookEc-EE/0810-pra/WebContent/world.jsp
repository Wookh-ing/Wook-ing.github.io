<%@page import="kr.co.greenart.People"%>
<%@page import="java.util.List"%>
<%@page import="kr.co.greenart.PeopleDAO"%>
<%
 	String people = request.getParameter("people");
	PeopleDAO dao = new PeopleDAO();
	List<People> list = dao.getPeopleByNameAndAge(people);
	
	request.setAttribute("list", list);
	request.getRequestDispatcher("result.jsp").forward(request, response);
%>