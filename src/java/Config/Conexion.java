package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/registro";
    private static final String USER = "root";
    private static final String PASSWORD = "12345678";
    private Connection con;

    public Conexion() {
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
            e.printStackTrace();
            // Consider rethrowing the exception if needed
            // throw new RuntimeException("Error al conectar a la base de datos", e);
        }
    }

    public Connection getConnection() {
        return con;
    }
}
