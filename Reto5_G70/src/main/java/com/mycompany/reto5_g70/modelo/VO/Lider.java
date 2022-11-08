/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto5_g70.modelo.VO;

/**
 *
 * @author PC
 */
public class Lider {
    private int id_lider;
    private String nombre;
    private String primer_apellido;
    private String ciudad_residencia;

    public Lider() {
    }

    public Lider(int id_lider, String nombre, String primer_apellido, String ciudad_residencia) {
        this.id_lider = id_lider;
        this.nombre = nombre;
        this.primer_apellido = primer_apellido;
        this.ciudad_residencia = ciudad_residencia;
    }

    public int getId_lider() {
        return id_lider;
    }

    public void setId_lider(int id_lider) {
        this.id_lider = id_lider;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getCiudad_residencia() {
        return ciudad_residencia;
    }

    public void setCiudad_residencia(String ciudad_residencia) {
        this.ciudad_residencia = ciudad_residencia;
    }

    @Override
    public String toString() {
        return "Lider{" + "id_lider=" + id_lider + ", nombre=" + nombre + ", primer_apellido=" + primer_apellido + ", ciudad_residencia=" + ciudad_residencia + '}';
    }

    
}
