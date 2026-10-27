package Connector;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnector {
    public static Connection conexion() {
        String url = "jdbc:postgresql://10.0.9.127:5432/postgres";
        String user = "postgres";
        String pass = "admin";
        Connection conn = null;
        try {
            
          conn = DriverManager.getConnection(url,user ,pass );
        } catch (Exception e) {
            System.out.println("Erro na conexión: "+ e.getMessage());
        }
        
        return conn;
    }
}
