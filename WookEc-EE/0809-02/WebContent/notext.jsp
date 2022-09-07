<%
	int result = 1 + 1;
	request.setAttribute("result", result);
	/* response.sendRedirect("result"); */
	request.getRequestDispatcher("/WEB-INF/viewPage.jsp")
		.forward(request, response);
%>