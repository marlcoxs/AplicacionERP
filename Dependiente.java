/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

/**
 *
 * @author FP Mañana A
 */
public class Dependiente {
    private String id_dependiente;
    private String nombre; 
    private String contraseña;
    public Dependiente(String id_dependiente, String nombre, String contraseña) {
        this.id_dependiente = id_dependiente;
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    public String getId_dependiente() {
        return id_dependiente;
    }

    public void setId_dependiente(String id_dependiente) {
        this.id_dependiente = id_dependiente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
     @Override
    public String toString() {
        return "Dependiente{" + "id_dependiente=" + id_dependiente + ", nombre=" + nombre + ", contrase\u00f1a=" + contraseña + '}';
    }
    
}
