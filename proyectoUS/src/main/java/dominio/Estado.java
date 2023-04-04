/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Windows
 */
public class Estado {
    int idEstado;
    String nomEstado;

    public Estado(int idEstado, String nomEstado){
        this.idEstado = idEstado;
        this.nomEstado = nomEstado;
    }
    public Estado(){
        
    }
    
    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getNomEstado() {
        return nomEstado;
    }

    public void setNomEstado(String nomEstado) {
        this.nomEstado = nomEstado;
    }
    
    
    
}
