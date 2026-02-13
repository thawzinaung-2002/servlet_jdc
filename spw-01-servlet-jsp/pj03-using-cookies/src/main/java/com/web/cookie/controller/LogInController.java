package com.web.cookie.controller;

import java.io.IOException;

import com.web.cookie.model.UserInformation;
import com.web.cookie.model.UserInformationMapper;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login")
public class LogInController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		var user = new UserInformation();
		
		user.setName(req.getParameter("name"));
		user.setEmail(req.getParameter("email"));
		user.setPhone(req.getParameter("phone"));
		
		var json = UserInformationMapper.toJson(user);
		
		var cookies = new Cookie("userInfo", json);
		cookies.setMaxAge(60*30);
		resp.addCookie(cookies);
		
		resp.sendRedirect(getServletContext().getContextPath().concat("/login-result.jsp"));
	}

}
