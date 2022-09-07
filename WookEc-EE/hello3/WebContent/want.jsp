<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>뭐보고싶냐?</title>
</head>
<body>
	<%= request.getParameter("progress") %>
	<form action="./switchpath.jsp">
		<input type="radio" name="a" value="fruit" />과일 
		<input type="radio" name="a" value="person" />사람
		<input type="submit" />
	</form>
</body>
</html>