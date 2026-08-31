/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salud;

/**
 *
 * @author jhon1
 */
public class Hospital {
    String nombre;
    String ciudad;
    
    public Hospital(String nombre, String ciudad){
        this.ciudad = ciudad;
        this.nombre = nombre;
    }
    
    public void mostrar(){
        System.out.println("Nombre del hospital: "+  nombre);
        System.out.println("Ciudad donde esta el Hospital"+ciudad);
    }
    
}
