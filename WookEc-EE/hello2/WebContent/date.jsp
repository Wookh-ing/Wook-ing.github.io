<%-- page directive --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>오늘 날짜</title>
</head>
<body>
	<p><%= java.time.LocalDate.now() %></p>
</body>
</html>