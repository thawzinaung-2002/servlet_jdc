<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Info</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI"
	crossorigin="anonymous"></script>


</head>
<body>

	<div class="container mt-4">

		<h1>User Information</h1>

		<c:choose>
			<c:when test="${userInfo ne null }">
				<div class="row">
					<div class="col-2">
						<div>Name</div>
						<div>Phone</div>
						<div>Email</div>
					</div>
					<div>
					<div>${userInfo.name}</div>
						<div>${userInfo.phone }</div>
						<div>${userInfo.email}</div>
					</div>
		
				</div>
			</c:when>
			<c:otherwise>
				<div class="alert alert-info">No User Info!</div>
			</c:otherwise>
		</c:choose>

		<a href="${pageContext.request.contextPath }" class="btn btn-primary">Login</a>


	</div>

</body>
</html>