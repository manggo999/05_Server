package edu.kh.servlet.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/signUp")
public class PracticeController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String inputId = req.getParameter("inputId");
		String inputPw = req.getParameter("inputPw");
		String inputPwCheck = req.getParameter("inputPwCheck");
		String inputName = req.getParameter("inputName");
		String inputAge = req.getParameter("inputAge");
		
		System.out.println(inputId);
		System.out.println(inputPw);
		System.out.println(inputPwCheck);
		System.out.println(inputName);
		System.out.println(inputAge);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/signup_result.jsp");
		
		dispatcher.forward(req, resp);
		
		
	}
	
	
	

}
