import Connector.DBconnector;

import java.sql.*;
import java.util.ArrayList;

public class CRUD {


    public void meterXogadores(String nome, String posicion, Integer idade) throws SQLException {
        String sql = "INSERT INTO xogadores (nome, posicion, idade) VALUES (?,?,?)";

        try (Connection conn = Connector.DBconnector.conexion();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nome);
            pstmt.setString(2, posicion);
            pstmt.setInt(3, idade);

            pstmt.executeUpdate();

        }
    }


    public void lerXogadores() throws SQLException {

        String sql = "SELECT id, nome FROM xogadores";

        try (Connection conn = Connector.DBconnector.conexion();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            ResultSet mostrar = pstmt.executeQuery();

            String line;
            String nome;
            while ((mostrar.next())) {
                line = mostrar.getString(1);
                nome = mostrar.getString(2);
                System.out.println(line + " " + nome);


            }


        }
    }

    public void lerXogador() throws SQLException {

        String sql = "SELECT id, nome FROM xogadores WHERE nome = ?";
        int i = 0;
        int bucle = Serializar.getLista().size() ;

        try (Connection conn = Connector.DBconnector.conexion();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            while  (  i != bucle ) {

                String a = Serializar.getLista().get(i).toString();

            pstmt.setString(1, a);

            ResultSet mostrar = pstmt.executeQuery();

            String line;
            String nome;
            while ((mostrar.next())) {
                line = mostrar.getString(1);
                nome = mostrar.getString(2);
                System.out.println(line + " " + nome);


            }
                i++;
            }

        }
    }


    public void meterNoEquipo(String nome, String posicion, Integer idade) throws SQLException {
        String sql = "INSERT INTO celta (nome, soldo) VALUES (?,?)";



        try (Connection conn = Connector.DBconnector.conexion();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nome);
            pstmt.setInt(2, idade);

            pstmt.executeUpdate();

        }
    }


}