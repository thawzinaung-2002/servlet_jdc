<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="bootstrap.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hello Java Web</h1>
	<ul>
		<li>
			<a href="hello">Hello Servlet!</a>
			<a href="${pageContext.request.contextPath }/registration.jsp">Registration</a>
		</li>
	</ul>
</body>
</html>