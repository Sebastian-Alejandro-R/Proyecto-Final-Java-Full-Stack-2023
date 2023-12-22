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
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.mycompany.socio.Socio;
import com.mycompany.dao.SocioDAO;

@WebServlet("/api/BuscarController")
public class BuscarController extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String clave = req.getParameter("clave");
		
		//Crear ProductoDAO
		SocioDAO dao = new SocioDAO();
		
		//invocar el metodo buscar(clave)
		List<Socio> listado = dao.buscar(clave);
		
		//guardar en el request el producto
		req.setAttribute("listado", listado);
		
		//ir a la siguiente pagina
		getServletContext().getRequestDispatcher("/listado.jsp").forward(req, resp);
	}
}
