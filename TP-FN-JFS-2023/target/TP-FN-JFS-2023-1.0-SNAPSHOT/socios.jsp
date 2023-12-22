<%-- 
    Document   : socios
    Created on : 20/12/2023, 15:38:32
    Author     : srandazzo
--%>

<!DOCTYPE html>
<html lang="es-ar" data-bs-theme="light">
	<head>
            <%@include file="head.jsp" %>
            <title>Inicio</title>
	</head>
	
	<body>
            <!-- ACA VA EL NAVBAR  -->
            <%@include file="navbar.jsp" %>		
            <main class="border border-primary rounded-4 text-center">
                <div class="container">
                    <section>
                        <h1>ABM de socios </h1>                
                        
                    </section>
                    
                    
                    
    <div id="place" class="container-fluid px-0">
      <div class="card bg-dark text-white">
        <img src="./assets/img/principal.jpg" class="card-img h-50" alt="">
        <div class="card-img-overlay d-flex flex-column justify-content-center align-items-end">
          <h3 id="texto" class="card-title  ">Corredores de La Sierra</h3>
          <p id="texto" class="card-text ">Desde aquí podrá administrar y consultar las cuentas de usuarios de Corredores de las Sierras con solo algunos clics.<br> 
            
          </p>
        
        </div>
      </div>
    </div>
                </div>
            </main>
            <%@include file="footer.jsp" %>
	</body>	
</html>