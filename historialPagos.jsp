<%-- 
    Document   : historialPagos
    Created on : 25/10/2024, 10:12:25?a.?m.
    Author     : Raul-PC
--%>

<%@page import="model.PagoDAO"%>
<%@page import="java.util.List"%>
<%
  String usuario = (String) session.getAttribute("usuario");
  List<Pago> pagos = PagoDAO.obtenerPagosPorUsuario(usuario);
%>
<table>
  <tr>
    <th>Nivel</th>
    <th>Monto</th>
  </tr>
  <%
    for (Pago pago : pagos) {
  %>
    <tr>
      <td><%= pago.getNivel() %></td>
      <td><%= pago.getMonto() %></td>
    </tr>
  <%
    }
  %>
</table>

