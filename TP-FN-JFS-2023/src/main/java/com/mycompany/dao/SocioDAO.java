/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

/**
 *
 * @author srandazzo
 */

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mycompany.conexion.AdministradorDeConexiones;
import com.mycompany.socio.Socio;
import java.sql.PreparedStatement;



public class SocioDAO {
    
     private static final String SQL_DELETE = "DELETE FROM SOCIOS WHERE ID_SOCIO = ?";
    
    
    public Socio obtenerPorId(Long id) {
		String sql = "SELECT * FROM SOCIOS WHERE ID_SOCIO="+id;
		
		//Connection
		Connection con = AdministradorDeConexiones.getConnection();
	
		Socio socioFromDb = null;
		
		//Statement
		try {
			Statement st = con.createStatement();
			
			//resultset
			ResultSet rs = st.executeQuery(sql);
			
			//VIENE UN SOLO REGISTRO!!!
			
			if(rs.next()) {//si existe, hay uno solo
				// rs > sacando los datos
			        Long id_Socio = rs.getLong(1);//tomar la primer columna
				String nombre = rs.getString(2);
				String apellido = rs.getString(3);
                                String dni = rs.getString(4);
				String mail = rs.getString(5);
                                boolean activo = rs.getBoolean(6);
				Date fecha_Alta = rs.getDate(7);
				
				//campos crear un objeto????
				socioFromDb = new Socio(id_Socio,nombre,apellido,dni,mail,activo,fecha_Alta);
			}			
		} catch (SQLException e) {
			// ERRORES
			e.printStackTrace();
		}
		return socioFromDb;
                
                
	
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public List<Socio> listarSocios() {
		String sql = "SELECT * FROM SOCIOS ";
		
		//Connection
		Connection con = AdministradorDeConexiones.getConnection();
                Socio socioFromDb = null;
	
		List<Socio> list = new ArrayList<>();
		
		//Statement
		try {
			Statement st = con.createStatement();
			
			//resultset
			ResultSet rs = st.executeQuery(sql);
			
			//VIENE UN SOLO REGISTRO!!!
			
			while(rs.next()) {//
				// rs > sacando los datos
				Long id_Socio = rs.getLong(1);//tomar la primer columna
				String nombre = rs.getString(2);
				String apellido = rs.getString(3);
                                String dni = rs.getString(4);
				String mail = rs.getString(5);
                                boolean activo = rs.getBoolean(6);
				Date fecha_Alta = rs.getDate(7);
				
				
				//campos crear un objeto????
				 socioFromDb = new Socio(id_Socio,nombre,apellido,dni,mail,activo,fecha_Alta);
				
				//agrego a la lista 
				list.add(socioFromDb);
			}			
			
			//cierro la conexion
			con.close();
		} catch (SQLException e) {
			// ERRORES
			e.printStackTrace();
		}
		return list;
	}
    
    
    /*crear un producto en la db*/
	public void crearSocio( String nombre, String apellido, String dni, String mail) {
		
		Connection con = AdministradorDeConexiones.getConnection();
		
		if(con != null) { 
			// insert en la db > SQL: INSERT INTO....
			String sql = "INSERT INTO SOCIOS (nombre, apellido, dni, mail) ";
			sql += "VALUES('"+nombre+"','"+apellido+"','"+dni+"','"+mail+"')";
			
			//control de errores
			try {
				Statement st = con.createStatement();			
				st.execute(sql);
				
				//cierre de conexion
				con.close();
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void actualizarSocio(String id_Socio, String nombre, String apellido, String dni, String mail) {
		Connection con = AdministradorDeConexiones.getConnection();
		if(con != null) { 
			String sql = "UPDATE SOCIOS "
					+ " set nombre='"+nombre+"',"
					+ " apellido='"+apellido+"',"
					+ " dni='"+ dni +"',"
                                        + " mail='"+ mail +"'"
					+ " WHERE id_socio = '"+id_Socio+"'";		
		
			try {
				Statement st = con.createStatement();			
				st.executeUpdate(sql);
				con.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
    
    public List<Socio> buscar(String clave) {
		String sql = "SELECT * FROM SOCIOS WHERE NOMBRE LIKE '%"+clave+"%' ";
		
		//Connection
		Connection con = AdministradorDeConexiones.getConnection();
	
		List<Socio> listado = new ArrayList<Socio>();
                 Socio socioFromDb = null;
		
		//Statement
		try {
			Statement st = con.createStatement();
			
			//resultset
			ResultSet rs = st.executeQuery(sql);
			
			//VIENE UN SOLO REGISTRO!!!
			
			while(rs.next()) {//
				// rs > sacando los datos
				Long id_Socio = rs.getLong(1);//tomar la primer columna
				String nombre = rs.getString(2);
				String apellido = rs.getString(3);
                                String dni = rs.getString(4);
				String mail = rs.getString(5);
                                boolean activo = rs.getBoolean(6);
				Date fecha_Alta = rs.getDate(7);
				
				
				//campos crear un objeto????
				 socioFromDb = new Socio(id_Socio,nombre,apellido,dni,mail,activo,fecha_Alta);
				
				//agrego a la lista 
				listado.add(socioFromDb);
			}			
		} catch (SQLException e) {
			// ERRORES
			e.printStackTrace();
		}
		
		return listado;
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
        public int eliminarSocio(int id) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try{
            conn = AdministradorDeConexiones.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, id);
            registros = stmt.executeUpdate();
        } catch(SQLException | NullPointerException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                stmt.close();
                conn.close();
            } catch(SQLException | NullPointerException ex) {
                ex.printStackTrace(System.out);
            }
        }
        
        return registros;
    }
    
    
    
    
    
}
