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
	<!-- 사용자가 대륙을 선택할수 있게 -->
	<!-- 선택한 대륙의 국가들의 이름, 인구를 볼 수 있는 (인구 내림차순 정렬) 페이지 -->
	<%
	List<String> list = (List<String>) request.getAttribute("continent");
	 %>
	<form action="./selectWorld.jsp">
	<select id="country" name="country">
	<% for (int i = 0; i < list.size(); i++)  {%>
		<option value="<%=list.get(i)%>"><li><%=String.valueOf(list.get(i))%></li></option>
		<%} %>
		
	<!-- <form action="./selectWorld.jsp">
	<select id="country" name="country">
		
		<option value="NorthAmerica">북미</option>
		<option value="SouthAmerica">남미</option>
		<option value="Asia">아시아</option>
		<option value="Africa">아프리카</option>
		<option value="Europe">유럽</option>
		<option value="Oceania">오세아니아</option>
		<option value="Antarctica">?</option> -->
	</select>
	<input type="submit" />

	</form>
</body>
</html>