<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- ul,li 목록 표현 -->
	<%
	List<String> list = (List<String>) request.getAttribute("countries");
	List<Integer> list1 = (List<Integer>) request.getAttribute("countries1");
	%>
	<ul>
	<% for (int i = 0; i < list.size(); i++) {%>
	<li><%= "국가명      " + list.get(i) + ",     인구수 " + list1.get(i) %></li>
	<%} %>
	</ul>
</body>
</html>