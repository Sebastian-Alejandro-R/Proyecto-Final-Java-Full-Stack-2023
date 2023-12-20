<%-- 
    Document   : socios
    Created on : 19/12/2023, 17:02:42
    Author     : srandazzo
--%>
<%@page import="java.util.List"%>
<%@page import="com.mycompany.socio.Socio"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es-ar" data-bs-theme="light"> 
    <head>
     <%--    <%@include file="head.jsp" %> --%>
        <title>
          Listado
        </title>	
    </head>
	
    <body>
      <%--   ACA VA EL NAVBAR 
        <%@include file="navbar.jsp" %> --%>
        <main>
            <div class="container">
                
                <section class="bg-secondary-subtle border rounded-5 m-4 px-2 pt-2 pb-3 col-12 mx-auto text-center">
      <h2 class="my-4">Listado</h2>
      <table class="table table-sm table-striped table-hover border border-success">
                      <thead>
                        <tr>
                          <th scope="col">ID</th>
                          <th scope="col">NOMBRE</th>
                          <th scope="col">APELLIDO</th>
                          <th scope="col">DNI</th>
                          <th scope="col">MAIL</th>
                          <th scope="col">FECHA ALTA</th>
                        </tr>
                      </thead>
          <% 
                //codigo java
                //obtener el listado desde el request
                //se guardo bajo el nombre de "listado"
            List<Socio> listado = (List<Socio>)request.getAttribute("listado");
          %>
        <tbody>
           <%
                 for( Socio  unSocio : listado) {  
            %> 

             <tr>
                <th scope="row"> <%=unSocio.getId_Socio()%> </th>
                <td><%=unSocio.getNombre() %></td>
                <td><%=unSocio.getApellido() %></td>
                <td><%=unSocio.getDni()%></td>
                <td><%=unSocio.getMail()%></td>
                <td><%=unSocio.getFecha_Alta()%></td>
                
                <td>
                  <a class="btn btn-danger" href="<%=request.getContextPath()%>/api/EliminarController?id=<%=unSocio.getId_Socio()%>" role="button">Eliminar</a> | 
                  <a class="btn btn-secondary" href="<%=request.getContextPath()%>/api/EditarController?id=<%=unSocio.getId_Socio()%>" role="button">Editar</a>
                </td>
              </tr>
            <%
                  }
             %>

        </tbody>
      </table>
    </section>

                      
            </div>
        </main>
    </body>	
</html>