/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto5_g70.modelo.VO;

/**
 *
 * @author PC
 */
public class Proyecto {
    private int id_proyecto;
    private String constructora;
    private int numero_habitaciones;
    private String ciudad;

    public Proyecto() {
    }

    public Proyecto(int id_proyecto, String constructora, int numero_habitaciones, String ciudad) {
        this.id_proyecto = id_proyecto;
        this.constructora = constructora;
        this.numero_habitaciones = numero_habitaciones;
        this.ciudad = ciudad;
    }

    public int getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(int id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public int getNumero_habitaciones() {
        return numero_habitaciones;
    }

    public void setNumero_habitaciones(int numero_habitaciones) {
        this.numero_habitaciones = numero_habitaciones;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "id_proyecto=" + id_proyecto + ", constructora=" + constructora + ", numero_habitaciones=" + numero_habitaciones + ", ciudad=" + ciudad + '}';
    }
    
}
