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
    
    
    public Socio obtenerPorId(Long id) {
		String sql = "SELECT * FROM SOCIO WHERE ID_SOCIO="+id;
		
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
    
    
    
    
    
    
}
