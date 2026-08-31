/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase_poo;

/**
 *
 * @author jhon1
 */
public class Carrera {

    String nombre;
    int semestres;
    Universidad universidad;

    public Carrera(String nombre, int semestres, Universidad universidad) {

        this.nombre = nombre;
        this.semestres = semestres;
        this.universidad = universidad;

    }

    public void mostrar() {
        System.out.println("Nombre Carrera: " + nombre);
        System.out.println("Numero de semestres: " + semestres);
        System.out.println("Nombre de la universidad: " + universidad.nombre);
    }

}
