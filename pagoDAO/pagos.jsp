<%-- 
    Document   : pagos
    Created on : 24/10/2024, 4:03:53 p. m.
    Author     : Raul-PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<form action="PagoServlet" method="post">
  <label for="nivel">Nivel a pagar:</label>
  <select name="nivel" id="nivel">
    <option value="1">Nivel A1</option>
    <option value="2">Nivel A2</option>
    <option value="3">Nivel B1</option>
    <option value="4">Nivel B2</option>
  </select>
  <label for="monto">Monto:</label>
  <input type="number" name="monto" id="monto" required>
  <button type="submit">Pagar</button>
</form>
