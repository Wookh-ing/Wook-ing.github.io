<!-- 
	입력 폼
	숫자 1
	숫자 2
	
	연산자 + - * / 선택
	전송
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
	<form action="./calcresult2.jsp">
	<input type="number" name="num1"/> <br />
	<input type="number" name="num2"/> <br />
	<input type="radio" name="calc" value="plus" />+
	<input type="radio" name="calc" value="minus" />-
	<input type="radio" name="calc" value="multip" />*
	<input type="radio" name="calc" value="division" />/
	<input type="submit" />
	</form>
</body>
</html>