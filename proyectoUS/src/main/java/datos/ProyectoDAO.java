/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import dominio.Proyecto;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Windows
 */
public class ProyectoDAO {
    public String SQL_select = "select * from proyecto where idproyecto=?;";
    public String SQL_insert = "insert into proyecto(nombre) values (?);";
    public String SQL_update = "update proyecto set nombre= ? where idproyecto=?;";
    public String SQL_delete = "delete from proyecto where idproyecto=?;";
    public String SQL_search = "select * from proyecto where nombre= ?";

    public int insertar(Proyecto proyecto){
        Connection conexion = null;
        PreparedStatement sentencia = null;
        int registros = 0;
        
        try {
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(SQL_insert);
            
            sentencia.setString(1, proyecto.getNomProyecto());
            System.out.println("nombre del proyecto: "+proyecto.getNomProyecto());
            registros = sentencia.executeUpdate();
            JOptionPane.showMessageDialog(null, "Proyecto Registrado");
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }finally{
            try{
                ConexionBD.cerrar(sentencia);
                ConexionBD.cerrar(conexion);
            }catch(SQLException e){
                e.printStackTrace(System.out);
            }
        }
        System.out.println("registros: "+registros);
        return registros;
    }
    
    public int empty(String texto){
        int resultado;
        boolean vacio;
        
        vacio = texto.equals("");
        if(vacio){
            resultado = 0;
        }else{
            resultado = 1;
        }
        return resultado;
    }
}
