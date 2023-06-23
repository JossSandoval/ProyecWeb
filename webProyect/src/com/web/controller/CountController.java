package com.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.modelo.DataUsers;
import com.web.modelo.DataUsersDao;

/**
 * Servlet implementation class CountController
 */
@WebServlet("/CountController")
public class CountController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	DataUsersDao datosDao;
	
	public void init() {
		datosDao =new DataUsersDao();
    }

	
	/*public CountController() {
		super();
	}*/

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		RequestDispatcher dispatcher = null;
			dispatcher = request.getRequestDispatcher("/Vistas/formulario.jsp");
		 dispatcher.forward(request, response);
	}
	
	
	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	
		boolean registroID=false;
		
		System.out.println(request.getParameter("id"));
		System.out.println(request.getParameter("name"));
		System.out.println(request.getParameter("lastName"));
		System.out.println(request.getParameter("email"));
		System.out.println(request.getParameter("address"));
		
		String id=request.getParameter("id");
		 String name=request.getParameter("name");
		 String lastName=request.getParameter("lastName");
		 String email=request.getParameter("email");
		 String address=request.getParameter("address");
		 String password=request.getParameter("password");
		 
	DataUsers datos = new DataUsers();
	
	datos.setId(id);
	datos.setName(name);
	datos.setLastName(lastName);
	datos.setEmail(email);
	datos.setAddress(address);
	datos.setPassword(password);
	
	try {
		registroID=datosDao.InserData(datos);
	} catch (Exception e) {
		 e.printStackTrace();
	}
	if(registroID == true) {
        request.setAttribute("firstName",datos.getName());
          request.setAttribute("lastName",datos.getLastName());
          request.setAttribute("username",datos.getEmail());
          request.setAttribute("contact", datos.getAddress());
          request.setAttribute("address", datos.getAddress());

          RequestDispatcher requestDispatcher = request.getRequestDispatcher("/DataController");
          requestDispatcher.forward(request, response);
        }
	}



}
