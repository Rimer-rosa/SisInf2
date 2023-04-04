/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Windows
 */
public class Historia_de_usuario {
    
    int idhistoria;
    int estado_idestado;
    String nombre;
    String descripcion;
    String condiciones;
    int importancia;
    int dificultad;

    public Historia_de_usuario(int estado, String nombre, String descripcion, String condiciones, int importancia, int dificultad) {//esto en caso crear un equipo
        this.estado_idestado = estado;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.condiciones = condiciones;
        this.importancia = importancia;
        this.dificultad = dificultad;
    }
    public Historia_de_usuario(){
        
    }
    
    public int getIdhistoria() {
        return idhistoria;
    }

    public void setIdhistoria(int idhistoria) {
        this.idhistoria = idhistoria;
    }

    public int getEstado_idestado() {
        return estado_idestado;
    }

    public void setEstado_idestado(int estado_idestado) {
        this.estado_idestado = estado_idestado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(String condiciones) {
        this.condiciones = condiciones;
    }

    public int getImportancia() {
        return importancia;
    }

    public void setImportancia(int importancia) {
        this.importancia = importancia;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }
    
    
}
