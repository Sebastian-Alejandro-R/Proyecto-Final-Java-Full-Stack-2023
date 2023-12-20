/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.socio;

import java.util.Date;


public class Socio 

{
	private Long id_Socio; 
	private String nombre;
	private String apellido;
        private String dni; 
	private String mail;
	private boolean activo;
	private Date fecha_Alta; 
	

	public Socio(Long id_Socio, String nombre, String apellido, String dni, String mail, boolean activo, Date fecha_Alta) {
	
            this.id_Socio = id_Socio;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.mail = mail;
		this.activo = activo;
		this.fecha_Alta = fecha_Alta;
	}

	public Long getId_Socio() {
		return id_Socio;
	}

	public void setId_Socio(Long id_Socio) {
		this.id_Socio = id_Socio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

        public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
        
        
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
        
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

        public boolean getActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
        	

	public Date getFecha_Alta() {
		return fecha_Alta;
	}

	public void setFecha_Alta(Date fecha_alta) {
		this.fecha_Alta = fecha_Alta;
	}

}

