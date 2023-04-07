/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Windows
 */
public class Rol_usuario {
    int idRol_usuario;
    String nomRol;

    public Rol_usuario(){
        
    }
    public Rol_usuario(String nombre){
        this.nomRol = nombre;
    }
    public Rol_usuario(int id, String nombre){
        this.idRol_usuario = id;
        this.nomRol = nombre;
    }
    
    public int getIdRol_usuario() {
        return idRol_usuario;
    }

    public void setIdRol_usuario(int idRol_usuario) {
        this.idRol_usuario = idRol_usuario;
    }

    public String getNomRol() {
        return nomRol;
    }

    public void setNomRol(String nomRol) {
        this.nomRol = nomRol;
    }
    
}
