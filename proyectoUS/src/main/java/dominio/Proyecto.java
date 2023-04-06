/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Windows
 */
public class Proyecto {
    int idproyecto;
    String nomProyecto;

    public Proyecto(){
        
    }
    
    public Proyecto(int id, String nombre){
        idproyecto = id;
        nomProyecto = nombre;
    }
    
    public int getIdproyecto() {
        return idproyecto;
    }
    
    public void setIdproyecto(int idproyecto) {
        this.idproyecto = idproyecto;
    }

    public String getNomProyecto() {
        return nomProyecto;
    }

    public void setNomProyecto(String nomProyecto) {
        this.nomProyecto = nomProyecto;
    }
}
