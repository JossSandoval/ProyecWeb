package com.web.test;


import java.util.ArrayList;
import java.util.List;

import com.web.modelo.DataUsers;
import com.web.modelo.DataUsersDao;

public class testDataUserDao {

	public static void main(String[] args) {
	
		
	/*	DataUsersDao datauserdao = new DataUsersDao();
		List<DataUsers> lista= new ArrayList<>();
		lista=datauserdao.ListarDatos();
		for (DataUsers dataUsers : lista) {
			System.out.println(dataUsers.getName());
			System.out.println(dataUsers.getLastName());
			System.out.println(dataUsers.getAddress());
			System.out.println(dataUsers.getEmail());
			System.out.println(dataUsers.getPassword());
			
		}*/
		DataUsers datos = new DataUsers();
		
		//datos.setId();
		datos.setName("Yazmin");
		datos.setLastName("Rosas");
		datos.setEmail("Yaz.19@gmailcom");
		datos.setAddress("nativitas N/A");
		datos.setPassword("yazmin19");
		
		
		
		
		DataUsersDao insert = new DataUsersDao();
		
		System.out.println(insert.InserData(datos));
		
	}

}
