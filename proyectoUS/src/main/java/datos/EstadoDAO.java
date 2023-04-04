/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import dominio.Estado;
import java.sql.*;
import java.util.*;
import javax.swing.JComboBox;
/**
 *
 * @author Windows
 */
public class EstadoDAO {
    public static final String SQL_SELECT = "SELECT * FROM estado";
    
    public void mostrar(JComboBox combo){
        Connection conexion = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        Estado estado = null;
        List<Estado> estados = new ArrayList<>();
        
        try{
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(SQL_SELECT);
            resultado = sentencia.executeQuery();
            
            while(resultado.next()){
                estado = new Estado();
                estado.setIdEstado(resultado.getInt("idestado"));
                estado.setNomEstado(resultado.getString("nomEstado"));
                estados.add(estado);
            }
            
        }catch(SQLException e) {
            e.printStackTrace(System.out);
        }finally{
            try{
                ConexionBD.cerrar(resultado);
                ConexionBD.cerrar(sentencia);
                ConexionBD.cerrar(conexion);
            }catch(SQLException e) {
            e.printStackTrace(System.out);
            }
        }
        cargarEstados(estados, combo);
    }
    
    private void cargarEstados(List<Estado> estados, JComboBox combo){
        for (int i = 0; i < estados.size(); i++) {
            combo.addItem(estados.get(i).getNomEstado());
        }
    }
    
}
