

<%
	String alphabet
		= request.getParameter("alphabet");
	

	if (alphabet.equals("a")) {
		request.getRequestDispatcher("./A.jsp")
		.forward(request, response);
	} else if (alphabet.equals("b")) {
		request.getRequestDispatcher("./B.jsp")
		.forward(request, response);
	} else if (alphabet.equals("c")) {
		request.getRequestDispatcher("./C.jsp")
		.forward(request, response);
	}

/* 	a페이지 = 시간
	b페이지 = 날짜
	c페이지 = 아무것도 없음 */
%>