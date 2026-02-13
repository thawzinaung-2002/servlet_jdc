package com.app.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(
		name = "helloServlet",
		urlPatterns = "/hello",
		loadOnStartup = 1
		)
public class HelloServlet extends HttpServlet {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() throws ServletException {
		System.out.println("=============== Initializing Servlet =========================");
		var maxFileSize = getServletConfig().getInitParameter("maxFileSize");
		var pageSize = getServletConfig().getInitParameter("totalPage");
		var waitingTime = getServletContext().getInitParameter("maxWait");
		System.out.println("Max File Size "+ maxFileSize);
		System.out.println("Page Size "+ pageSize);
		System.out.println("Waiting Time "+ waitingTime);
	}
	
	@Override
	public void destroy() {
		System.out.println("=============== Destroying Servlet =========================");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().append("""
				<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Servlet without XML!</h1>
	<ul>
		<li>
			<a href="./">Home</a>
		</li>
	</ul>
</body>
</html>
				""");
	}

}
