
<%@page import="hello.Person"%>
<%@page import="hello.PersonDAO"%>
<%@page import="java.util.List"%>

<%
	PersonDAO dao = new PersonDAO();
	List<Person> list = dao.getPersonList();
	
	request.setAttribute("list", list);
	request.getRequestDispatcher("result.jsp").forward(request, response);
%>

<%
	
	

%>