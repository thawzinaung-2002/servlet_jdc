<%@ tag language="java" pageEncoding="UTF-8"%>

<%@ attribute name="title" required="true" type="java.lang.String"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="root" scope="request" value="${pageContext.request.contextPath }"></c:set>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listener | ${title }</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI"
	crossorigin="anonymous"></script>
	
	<link rel="stylesheet" href="${root }/static/style/application.css">

</head>
<body>

	<!-- Top Menu -->
	<nav class="navbar navbar-expand shadow-sm">
		<div class="container">
			<a href="${root }/" class="navbar-brand"> <i class="bi-house"></i> Home
			</a>

			<ul class="navbar-nav">
				<li class="nav-item"><a href="${root}/sales" class="nav-link">Sales</a></li>
				<li class="nav-item"><a href="${root }/products" class="nav-link">Products</a></li>
				<li class="nav-item"><a href="${root}/categories" class="nav-link">Categories</a>
				</li>

			</ul>

		</div>
	</nav>

	<!-- Content -->
	
	<main class="container mt-3">
		<jsp:doBody></jsp:doBody>
	</main>


</body>
</html>