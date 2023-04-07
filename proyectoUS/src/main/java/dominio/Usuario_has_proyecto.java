/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Windows
 */
public class Usuario_has_proyecto {
    int usuario_id;
    int proyecto_id;
    int rol_usuario_id;

    public Usuario_has_proyecto(){
        
    }
    
    
    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public int getProyecto_id() {
        return proyecto_id;
    }

    public void setProyecto_id(int proyecto_id) {
        this.proyecto_id = proyecto_id;
    }

    public int getRol_usuario_id() {
        return rol_usuario_id;
    }

    public void setRol_usuario_id(int rol_usuario_id) {
        this.rol_usuario_id = rol_usuario_id;
    }
    
}
