package pagoDAO;

/** Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Raul-PC
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class pagoDAO_1  {
    
    // Configuración de la base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/pagos_html_servlets";
    private static final String USER = "tu_usuario";
    private static final String PASSWORD = "K4NAEriol89720ryok4naeDSBAA4378monday";
    
    public void insertarPago(Pago pago) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            // Cargar el driver de MySQL (opcional a partir de JDBC 4.0, pero recomendable)
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establecer la conexión
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            
            // Consulta SQL de inserción
            String sql = "INSERT INTO pagos (usuario, nivel, monto) VALUES (?, ?, ?)";
            statement = connection.prepareStatement(sql);
            
            // Asignar valores a los parámetros
            statement.setString(1, pago.getUsuario());
            statement.setString(2, pago.getNivel());
            statement.setDouble(3, pago.getMonto());
            
            // Ejecutar la inserción
            statement.executeUpdate();
            System.out.println("Pago insertado correctamente.");
            
        } catch (SQLException e) {
            // Manejo de errores de SQL
            System.err.println("Error al conectar o insertar en la base de datos: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            // Manejo del error de clase no encontrada (si el driver no se carga)
            System.err.println("Error al cargar el driver de la base de datos: " + e.getMessage());
        } finally {
            // Cerrar los recursos de manera segura
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión o el statement: " + e.getMessage());
            }
        }
    }
}


    
