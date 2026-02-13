<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>

</head>
<body>

	<div class="container mt-4">
		<h1>Using Cookies Demo</h1>
		<form action="${pageContext.request.contextPath }/login" method="post">
			<div class="mb-3">
				<label class="form-label">Name</label>
				<input type="text" name="name" placeholder="User Name" class="form-control" required/>
			</div>
			
			<div class="mb-3">
				<label class="form-label">Phone</label>
				<input type="text" name="phone" placeholder="Phone" class="form-control" required/>
			</div>
			
			<div class="mb-3">
				<label class="form-label">Email</label>
				<input type="text" name="email" placeholder="Email" class="form-control" required/>
			</div>
			
			<button type="submit" class="btn btn-primary">Submit</button>
			
		</form>
	</div>

</body>
</html>