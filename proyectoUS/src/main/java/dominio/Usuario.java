/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Windows
 */
public class Usuario {
    int idUsuario;
    String correo_E;
    String contrasenia;
    String nombres;
    String apellidos;

    public Usuario(){
        
    }
    
    public Usuario(String correo, String contrasenia, String nombre, String apellido){
        
        this.correo_E = correo;
        this.contrasenia = contrasenia;
        this.nombres = nombre;
        this.apellidos = apellido;
    }
    
    public Usuario(String correo, String nombre, String apellido){
        
        this.correo_E = correo;
        this.nombres = nombre;
        this.apellidos = apellido;
    }
    
    public Usuario(int id, String correo, String contra, String nombres, String apellidos){
        
        this.idUsuario = id;
        this.correo_E = correo;
        this.contrasenia = contra;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }
    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getCorreo_E() {
        return correo_E;
    }

    public void setCorreo_E(String correo_E) {
        this.correo_E = correo_E;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    
}
