<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello Java Web!</title>
</head>
<body>
	<h1>Hello Java Web</h1>
	<ul>
		<li>
			<a href="hello?name=Thidar&phone=09779580179">Hello Servlet!</a>
		</li>
		
		<li>
			<a href="headerInfo">Header Info</a>
		</li>
	</ul>
	
	
	<form action="hello" method="post">
		<table>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" placeholder="Enter Name" /></td>
			</tr>
			
			<tr>
				<td>Phone</td>
				<td><input type="tel" name="phone" placeholder="Enter Phone" /></td>
			</tr>
			
			<tr><button type="submit">Send</button></tr>
		</table>
	</form>
	
</body>
</html>