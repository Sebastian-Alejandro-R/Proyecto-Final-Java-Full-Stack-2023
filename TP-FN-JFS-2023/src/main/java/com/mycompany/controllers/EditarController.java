/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controllers;

/**
 *
 * @author srandazzo
 */


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycompany.dao.SocioDAO;
import com.mycompany.socio.Socio;

@WebServlet("/api/EditarController")
public class EditarController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		
		//Crear ProductoDAO
		SocioDAO dao = new SocioDAO();
		
		//invocar el metodo obtenerPorId(id)
		Socio socioFromDb = dao.obtenerPorId(Long.parseLong(id));
		
		//guardar en el request el producto
		req.setAttribute("socio", socioFromDb);
		
		//ir a la siguiente pagina
		getServletContext().getRequestDispatcher("/editar.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id_Socio = req.getParameter("id_Socio");
                String nombre = req.getParameter("nombre");
		String apellido = req.getParameter("apellido");
		String dni = req.getParameter("dni");
		String mail = req.getParameter("mail");
                String activo = req.getParameter("activo");
                String fecha_alta = req.getParameter("fecha_alta");
                
                
                //Crear ProductoDAO
		SocioDAO dao = new SocioDAO();
		
		//invocar actualizarProducto(params)
		dao.actualizarSocio(id_Socio, nombre, apellido, dni, mail);

		//ir a la siguiente pagina
		resp.sendRedirect(req.getContextPath()+"/api/ListadoController");
	}
}



