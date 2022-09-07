<%@page import="java.time.LocalTime"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>A</h1>
<%
LocalTime time = LocalTime.now();  
out.println(time);
%>
</body>
</html>