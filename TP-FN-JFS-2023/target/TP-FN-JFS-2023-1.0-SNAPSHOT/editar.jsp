<%-- 
    Document   : editar
    Created on : 20/12/2023, 11:19:59
    Author     : srandazzo
--%>

<html>
    <head>
          <%@include file="head.jsp" %>	
         
    </head>

    <body style=" background-color: rgb(240, 218, 210); font-family: 'Young Serif'">
        <main>
        <%@page import="com.mycompany.socio.Socio"%>
              <%@include file="navbar.jsp" %> 
            <div class="container">
                <section style=" background-color: rgb(240, 218, 210); font-family: 'Young Serif'">
                           <% 
                         Socio socio = (Socio)request.getAttribute("socio");
                   %> <%-- --%>
                    <h1 style="font-family: 'Young Serif'">Editar socio ID=<%=socio.getId_Socio()%>    </h1>
                    <!--  JSP -->
                    <form method="POST"
                            action="<%=request.getContextPath()%>/api/EditarController">
                            <div class="mb-3">
                              <label for="exampleFormControlInput1" class="form-label">Nombre</label>
                              <input name="nombre"
                                    value="<%=socio.getNombre()%>"  
                                    type="text" class="form-control" id="exampleFormControlInput1" placeholder="Nombre" maxlength="50">
                            </div>
                            <div class="mb-3">
                              <label for="exampleFormControlTextarea1" class="form-label">Apellido</label>
                              <input name="apellido"
                                    value="<%=socio.getApellido()%>" 
                                    type="text" class="form-control" id="exampleFormControlTextarea1">
                            </div>
                            <div class="my-3 mx-3">
                                <label for="exampleFormControlTextarea1"" class="form-label">DNI</label>
                                <input value="<%=socio.getDni()%>" name="dni" type="text" class="form-control" id="hechoTextarea" placeholder="DNI" maxlength="7">
                            </div>
                            <div class="mb-3">
                              <label for="exampleFormControlTextarea1" class="form-label">Mail</label>
                              <input name="mail" value="<%=socio.getMail() %>"  type="text" class="form-control" id="exampleFormControlTextarea1" maxlength="50">
                            </div>
                             <div class="mb-3">
                              <label for="exampleFormControlTextarea1" class="form-label">Id</label>
                              <input name="id_Socio"
                                    readonly="readonly"
                                    value="<%=socio.getId_Socio()%>" 
                                    type="text" class="form-control" id="exampleFormControlTextarea1" maxlength="7">
                            </div>
                            <button class="btn btn-primary">
                                Grabar
                            </button>
                    </form>
                </section>
            </div>
        </main>
    </body>	
</html>