/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

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
}
