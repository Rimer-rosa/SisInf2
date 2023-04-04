/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import dominio.Historia_de_usuario;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Windows
 */
public class Historia_de_usuarioDAO {
    public String SQL_select = "select * from historia_de_usuario where idHistoria=?;";
    public String SQL_insert = "insert into historia_de_usuario(estado_idestado, nombre, descripcion, condiciones, importancia, dificultad) values (?,?,?,?,?,?);";
    public String SQL_update = "update equipos set nombre= ? ,puntos=? where idEquipos=?;";
    public String SQL_delete = "delete from equipos where idEquipos=?;";
    public String SQL_search = "select * from equipos where nombre= ? and puntos=?;";
    
    
    
     public int insertar(Historia_de_usuario historia){
        Connection conexion = null;
        PreparedStatement sentencia = null;
        int registros = 0;
        
        try {
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(SQL_insert);
            sentencia.setInt(1,historia.getEstado_idestado());
            sentencia.setString(2, historia.getNombre());
            sentencia.setString(3, historia.getDescripcion());
            sentencia.setString(4,historia.getCondiciones());
            System.out.println("importancia: "+historia.getImportancia()+"dificultad: "+historia.getDificultad());
            sentencia.setInt(5, historia.getImportancia());
            sentencia.setInt(6, historia.getDificultad());
            registros = sentencia.executeUpdate();
            JOptionPane.showMessageDialog(null, "Equipo Registrado");
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
    
    
    
    
    
    
    
    public int empty(String nombre){
        int resultado;
        boolean vacio;
        
        vacio = nombre.equals("");
        if(vacio){
            resultado = 0;
        }else{
            resultado = 1;
        }
        return resultado;
    }
    
    
}
