/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogit.entidades;

/**
 *
 * @author Eduardo.AM
 */
public class Conejo {
    
    private String raza;
    private String tamaño;
    private String color;

    public Conejo() {
    }

    public Conejo(String raza, String tamaño, String color) {
        this.raza = raza;
        this.tamaño = tamaño;
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Conejo{" + "raza=" + raza + ", tama\u00f1o=" + tamaño + ", color=" + color + '}';
    }
    
    
    
}
