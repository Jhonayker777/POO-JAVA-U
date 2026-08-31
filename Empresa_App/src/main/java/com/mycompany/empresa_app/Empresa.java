/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresa_app;

/**
 *
 * @author jhon1
 */
public class Empresa {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    private String nombre;
    private String nit;
    private String ciudad;

    public Empresa(String nombre, String nit, String ciudad) {
        this.nombre = nombre;
        this.nit = nit;
        this.ciudad = ciudad;
    }

    public void mostrar() {
        System.out.println("Nombre de la emprsa: " + nombre);
        System.out.println("Nombre de la ciudad de la empresa : " + ciudad);
        System.out.println("nit de la ciudad : " + nit);

    }

}
