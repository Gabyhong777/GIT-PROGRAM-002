<%-- 
    Document   : Jogin
    Created on : 24/10/2024, 4:00:42 p. m.
    Author     : Raul-PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<form action="LoginServlet" method="post">
  <label for="username">Usuario:</label>
  <input type="text" id="username" name="username" required>
  <label for="password">Contraseña:</label>
  <input type="password" id="password" name="password" required>
  <button type="submit">Iniciar Sesión</button>
</form>

