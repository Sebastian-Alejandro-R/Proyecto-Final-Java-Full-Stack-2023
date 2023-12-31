<%-- 
    Document   : navbar
    Created on : 20/12/2023, 15:36:08
    Author     : srandazzo
--%>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="<%=request.getContextPath()%>">Corredores de las Sierras</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link" href="<%=request.getContextPath()%>/alta.jsp">Nuevo socio</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="<%=request.getContextPath()%>/api/ListadoController">Listar socios</a>
        </li>
        
      </ul>
      <form class="d-flex"	
      	action="<%=request.getContextPath()%>/api/BuscarController" 
      	method="get">
        <input name="clave" class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Buscar</button>
      </form>
    </div>
  </div>
</nav>