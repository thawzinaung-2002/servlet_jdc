<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ include file="bootstrap.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
</head>
<body>

	<div class="container mt-4">
		<h1>Student Registration</h1>
		<form action="${pageContext.request.contextPath }/registration" method="post">
			<div class="mb-3">
				<label class="form-label">Student Name</label>
				<input class="form-control" type="text" name="name" placeholder="Enter your name" />
			</div>
			
			<div class="mb-3">
				<label class="form-label">Phone</label>
				<input class="form-control" type="tel" name="phone" placeholder="Enter phone" />
			</div>
			
			<div class="mb-3">
				<label class="form-label">Email</label>
				<input class="form-control" type="email" name="email" placeholder="Enter email" />
			</div>
			
			<div class="mb-3">
				<button type="submit">Send</button>
			</div>
		</form>
	</div>

</body>
</html>