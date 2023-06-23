package com.web.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.web.db.Conexion;

public class DataUsersDao {
	
	 Connection conexion;
	
	public DataUsersDao()  {
		 conexion = Conexion.getConnection();
	}


	 public  List <DataUsers> ListarDatos(){
		 PreparedStatement ps;
		 ResultSet rs;
		List<DataUsers> lista= new ArrayList<>();
		try {
			ps= conexion.prepareStatement("SELECT * FROM Formulario.DataLogin");
			rs=ps.executeQuery();
			while(rs.next()) {
				
				String id = rs.getString(1);
				String name= rs.getString(2);
				String	lastname=rs.getString(3);
				String	address=rs.getString(4);
				String	email=rs.getString(5);
				String	password="*****";
				DataUsers data= new DataUsers( id,  name,  lastname,  email,  address,  password);
				lista.add(data);
			}			
			return lista;
		} catch (Exception e) {
			System.out.println(e.toString());
			e.fillInStackTrace();
			return null;
		}
	}
	
	
	/*public DataUsers mostrarData(int _id){
		DataUsers data = null;
		PreparedStatement ps;
		 ResultSet rs;
		try {
			ps= conexion.prepareStatement("SELECT * FROM Formulario.DataLogin where id=?");
			rs=ps.executeQuery();
			while(rs.next()) {	
				String id = rs.getString(1);
				String name= rs.getString(2),
						lastname=rs.getString(3),
						address=rs.getString(4),
						email=rs.getString(5),
						password="*****";				
				data= new DataUsers( id, name,  lastname,  email,  address,  password);
			}
			return data;
		} catch (Exception e) {
			System.out.println(e.toString());
			return null;
		}
	}*/
	
	
	public boolean InserData( DataUsers data) {
		boolean result= false ;
		
		Connection conec;

		//PreparedStatement ps;
		Statement st; 
		try {
			conec=Conexion.getConnection();
			st=conec.createStatement(); 
			//System.out.println(st.execute("INSERT INTO Formulario.DataLogin (`name`,`lastname`,`email`,`address`,`pasword`) VALUES ( 'Ana', 'Alanis', 'anagmail.com', 'nativitas', 'ana123' )"));
			st.execute("INSERT INTO Formulario.DataLogin (`name`,`lastname`,`email`,`address`,`pasword`) VALUES ( '"+data.getName()+"', '"+data.getLastName()+"', '"+data.getEmail()+"', '"+data.getAddress()+"', '"+data.getPassword()+"' )");
			//result=st.execute("INSERT INTO Formulario.DataLogin (`name`,`lastname`,`email`,`address`,`pasword`) VALUES ( 'Demetrio', 'Cristobal', 'demetrio@gmail.com', 'nativitas', 'demetrioh' )");
			result=true;

		} catch (Exception e) {
		//e.printStackTrace();
		
		
		}
		return result;
		
	}
	
	
	public boolean UpdateData( DataUsers data, int _id){
		PreparedStatement ps;
		 ResultSet rs;
		try {
			ps = conexion.prepareStatement("UPDATE `Formulario`.`DataLogin` `name`=?,`lastname`=?,`email`=?,`address`=?,`pasword`=? where id=?");
			ps.setInt(1, _id);
			ps.setString(2, data.getName());
			ps.setString(3, data.getLastName());
			ps.setString(4, data.getEmail());
			ps.setString(5, data.getPassword());
			ps.execute();
			return true;
		} catch (Exception e) {
			System.out.println(e.toString());
			return false;
		}
		
	}
	
	
	public boolean EliminarData( int _id){
		PreparedStatement ps;
		try {
			ps = conexion.prepareStatement("DELETE FROM `Formulario`.`DataLogin` where id=?");	
			ps.setInt(1, _id);	
			ps.execute();
			return true;
		} catch (Exception e) {
			System.out.println(e.toString());
			return false;
		}
		
	}
	
	
	
	
	
	
	
	
}
