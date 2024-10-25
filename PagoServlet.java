
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Raul-PC
 */

@WebServlet("/PagoServlet")
public class PagoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nivel = request.getParameter("nivel");
        double monto = Double.parseDouble(request.getParameter("monto"));
        String usuario = null;
        Pago pago = new Pago(usuario, nivel, monto);
        PagoDAO.registrarPago(pago);

        try {
            response.sendRedirect("historialPagos.jsp");
        } catch (java.io.IOException ex) {
            Logger.getLogger(PagoServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
