package com.app.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.app.servlet.model.StudentModel;


@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		var name = request.getParameter("name");
		var phone = request.getParameter("phone");
		var email = request.getParameter("email");
		
		var studentId = StudentModel.getInstance().addStudent(name, phone, email);
				
		response.sendRedirect(request.getContextPath() + "/registration?id=" + studentId);
		
//		request.setAttribute("student", student);
//		
//		var dispatcher = request.getRequestDispatcher("registration-result.jsp");
//		
//		dispatcher.forward(request, response);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		var id = req.getParameter("id");
		
		var student = StudentModel.getInstance().findById(Integer.parseInt(id));
		
		req.setAttribute("student", student);
		
		req.getRequestDispatcher("registration-result.jsp").forward(req, resp);
		
		
	}

}
