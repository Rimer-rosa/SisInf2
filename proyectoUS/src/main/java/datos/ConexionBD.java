/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.sql.*;


/**
 *
 * @author Windows
 */
public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/proyectostories";
    private static final String user = "Prueba";
    private static final String password = "123456789";
    
    public static Connection getConexion() throws SQLException{
        return DriverManager.getConnection(URL,user,password);
    }
    
    public static void cerrar(Connection conexion) throws SQLException{
        conexion.close();
    }
    
    public static void cerrar(Statement sentencia) throws SQLException{
        sentencia.close();
    }
    
    public static void cerrar(PreparedStatement sentencia) throws SQLException{
        sentencia.close();
    }
    
    public static void cerrar(ResultSet resultado) throws SQLException{
        resultado.close();
    }
}
