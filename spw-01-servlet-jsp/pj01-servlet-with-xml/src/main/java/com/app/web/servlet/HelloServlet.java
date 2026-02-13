package com.app.web.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{

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
		
		var name = req.getParameter("name");
		var phone = req.getParameter("phone");
		
		resp.getWriter().append("""
					<!DOCTYPE html>
					<html>
					<head>
					<meta charset="UTF-8">
					<title>Hello Java Web!</title>
					</head>
					<body>
						<h1>Hello Java Web</h1>
						<table>
							<tr>
								<td>Name</td>
								<td>%s</td>
							</tr>
							<tr>
								<td>Phone</td>
								<td>%s</td>
							</tr>
						</table>
						<a href="/pj01-servlet-with-xml">Home</a>
					</body>
					</html>
				""".formatted(name, phone));
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
