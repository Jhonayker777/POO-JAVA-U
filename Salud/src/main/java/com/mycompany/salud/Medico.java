/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salud;

/**
 *
 * @author jhon1
 */
public class Medico {
    String nombre;
    String especialidad;
    Hospital hospital;
    
    public Medico(String nombre, String especialidad, Hospital hospital){
        this.especialidad = especialidad;
        this.nombre = nombre;
        this.hospital = hospital;
    }
    
    public void mostrar(){
        System.out.println("Nombre del medico:"+ nombre);
        System.out.println("especialidad del medico:"+ especialidad);
        System.out.println("Hospital en el que se encuentra"+ hospital.nombre);
    }
    
}
