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

	<div class="container mt-4">
		<h1>Registration Result</h1>
		<div class="w-50">
			<table class="table table-striped">
				<tr>
					<td>Student Id</td>
					<td>${student.id() }</td>
				</tr>
				
				<tr>
					<td>Student Phone</td>
					<td>${student.phone() }</td>
				</tr>
				
				<tr>
					<td>Student Email</td>
					<td>${student.email() }</td>
				</tr>
				
				
			</table>
		</div>
	</div>

</body>
</html>