<%-- 
    Document   : alta
    Created on : 20/12/2023, 16:04:14
    Author     : srandazzo
--%>

<html>
    <head>
            <%@include file="head.jsp" %>
    </head>

    <body style=" background-color: rgb(240, 218, 210); font-family: 'Young Serif'">
        <main>
          
            <%@include file="navbar.jsp" %>
            <div class="container">
                <section class="border border-primary rounded-4 col-6 mx-auto text-center" style=" background-color: rgb(240, 218, 210); font-family: 'Young Serif'">
                    <h1 class="text-center my-4">Alta</h1>
                    <!--  JSP -->
                    <form method="post"
                        action="<%=request.getContextPath()%>/CreateController">
                        <div class="my-3 mx-3">
                          <input name="nombre"  type="text" class="form-control" id="nombreTex" placeholder="Nombre" maxlength="50">
                        </div>
                        <div class="my-3 mx-3">
                          <input name="apellido" type="text" class="form-control" id="apellidotext" placeholder="Apellido"  maxlength="50">
                        </div>
                        <div class="my-3 mx-3">
                          <input name="dni" type="text" class="form-control" id="dnitext" placeholder="DNI" maxlength="50">
                        </div>
                        <div class="my-3 mx-3">
                          <input name="mail" type="text" class="form-control" id="mailtext" maxlength="50" placeholder="Mail">
                        </div>
                        <button class="btn btn-primary my-3">
                            Dar de alta
                        </button>
                    </form>
                </section>
            </div>
        </main>
    </body>	
</html>