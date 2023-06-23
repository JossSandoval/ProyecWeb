package com.web.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.web.modelo.DataUsers;

import sun.applet.Main;

public class Conexion {

    // Propiedades
	
    private static Connection conn;
    private Conexion()  {
        try {
            String url = "jdbc:mysql://localhost:3306/Formulario";//?serverTimezone=UTC
            String user = "root";
           String password = "adminpw01";
        	Class.forName("com.mysql.cj.jdbc.Driver");
            conn =  DriverManager.getConnection(url, user, password);
        	//conn =  DriverManager.getConnection("jdbc:mysql://192.168.100.193:3306/Formulario?user=joss&password=joss:");
            System.out.println( "TEST OK" );
        } catch (Exception e ) {
            e.printStackTrace();
        }
	}
      
    
	  public static  Connection getConnection()  {
		  
		  if(conn == null) {
			  new Conexion();
		  }
	        return conn;
	    }
	 

	  
    
}
