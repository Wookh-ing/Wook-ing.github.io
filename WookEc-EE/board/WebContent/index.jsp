<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="u" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원제 게시판 예제</title>
</head>
<body>
<u:isLogin>
	${ authUser.name }님, 안녕하세요.
	<a href="logout.do">[로그아웃하기]</a>
	<a href="changePwd.do">[암호변경하기]</a>
</u:isLogin>
<u:notLogin>
	<a href="join.do">[회원가입하기]</a>
	<a href="login.do">[로그인하기]</a>
</u:notLogin>
<%-- <c:if test="${! empty authUser}">
	${ authUser.name }님, 안녕하세요.
	<a href="logout.do">[로그아웃하기]</a>
	<a href="changePwd.do">[암호변경하기]</a>
</c:if>
<c:if test="${ empty authUser }">
	<a href="join.do">[회원가입하기]</a>
	<a href="login.do">[로그인하기]</a>
</c:if> --%>
<br/>

</body>
</html>