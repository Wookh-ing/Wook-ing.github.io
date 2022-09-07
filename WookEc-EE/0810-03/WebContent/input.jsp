<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사람</title>
</head>
<body>
	<form action="./addpeople" method="post">
		<input type="text" name="name" />
		<input type="number" name="age" />
		<input type="submit" name="추가"  />
	</form>
	

</body>
</html>