/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase_poo;

/**
 *
 * @author jhon1
 */
public class Universidad {

    String nombre;
    String ciudad;

    public Universidad(String nombre, String ciudad) {

        this.nombre = nombre;
        this.ciudad = ciudad;

    }

    public void mostrar() {

        System.out.println("Nombre Universidad:" + nombre);
        System.out.println("Nombre Ciudad:" + ciudad);

    }
}
