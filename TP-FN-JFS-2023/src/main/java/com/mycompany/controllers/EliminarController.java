/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controllers;

/**
 *
 * @author Gatienzo
 */

import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

import com.mycompany.conexion.AdministradorDeConexiones;
import com.mycompany.dao.SocioDAO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.swing.JFrame;
import javax.swing.JOptionPane;







@WebServlet("/api/EliminarController")
public class EliminarController extends HttpServlet {
    
    
   
    
    
    
    
    
    

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
	
      
     
            
            
            String id = req.getParameter("id");
                
                SocioDAO dao = new SocioDAO();
                
                dao.eliminarSocio(Integer.valueOf(id));
		
                resp.sendRedirect(req.getContextPath()+"/api/ListadoController");

	}
}
