<!--
	계산결과 출력 페이지
  -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String result1 = request.getParameter("num1");
	int a = Integer.parseInt(result1);
	String result2 = request.getParameter("num2");
	int b = Integer.parseInt(result2);
	String calc = request.getParameter("calc");

	if (calc.equals("plus")) {
		out.println(a + b);
	} else if (calc.equals("minus")) {
		out.println(a - b);
	} else if (calc.equals("multip")) {
		out.println(a * b);
	} else if (calc.equals("division")) {
		out.println(a / b);
	}
	%>

</body>
</html>