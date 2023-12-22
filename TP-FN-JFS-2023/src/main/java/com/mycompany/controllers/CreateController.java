/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycompany.dao.SocioDAO;

/**
 *
 * @author srandazzo
 */
@WebServlet("/CreateController")
public class CreateController extends HttpServlet{
    
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String nombre = req.getParameter("nombre");
		String apellido = req.getParameter("apellido");
		String dni = req.getParameter("dni");
		String mail = req.getParameter("mail");
		
		//crear ProductoDAO
		SocioDAO dao = new SocioDAO();
		
		//ejecutar el metodo crearSocio(parametros...)
		dao.crearSocio(nombre, apellido, dni, mail);
		
		//ctrl+shit+o
		//ir a la siguiente pagina
		resp.sendRedirect(req.getContextPath()+"/api/ListadoController");
	}
    
}
