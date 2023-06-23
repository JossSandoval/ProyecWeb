package com.web.controller;

import java.io.IOException;
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
 * Servlet implementation class DataController
 */
@WebServlet("/DataController")
public class DataController extends HttpServlet {
	 private static final long serialVersionUID = 1L;
    public DataController() {
       
    }

@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
	
				DataUsersDao dataUserDao = new DataUsersDao();
		String accion;
		RequestDispatcher dispatcher = null;

		accion = request.getParameter("accion");

		if (accion == null || accion.isEmpty()) {
			dispatcher = request.getRequestDispatcher("/Vistas/Tabla.jsp");
			List<DataUsers> listaUsuarios= new ArrayList<>();
			listaUsuarios=dataUserDao.ListarDatos();
			request.setAttribute("usuarios", listaUsuarios);
			
		}
		dispatcher.forward(request, response);
	}




@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
