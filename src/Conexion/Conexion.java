package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    private static final String URL =
            "jdbc:mysql://localhost:3306/sistema_financiero";

    private static final String USER =
            "root";

    private static final String PASSWORD =
            "root";

    public static Connection conectar() {

        try {

            return DriverManager.getConnection(
                    URL,
                    USER,
                    PASSWORD);

        } catch (Exception e) {

            System.out.println(
                    "Error de conexión: "
                    + e.getMessage());

            return null;
        }
    }
}