
<%
	String a = request.getParameter("a");

if (a == null || a.length() == 0) {
	response.sendRedirect("./want.jsp?progress=failed");
} else if (a.equals("fruit")) {
	response.sendRedirect("./fruit.jsp");
} else if (a.equals("person")) {
	response.sendRedirect("./persons.jsp");
}
%>
