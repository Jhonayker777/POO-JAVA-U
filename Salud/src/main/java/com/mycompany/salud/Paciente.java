/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salud;

/**
 *
 * @author jhon1
 */
public class Paciente {
    String nombre;
    int edad;
    String motivo_consulta;
    Medico medico;

    
    public Paciente(String nombre, int edad, String motivo_consulta, Medico medico){
        this.edad = edad;
        this.nombre = nombre;
        this.motivo_consulta = motivo_consulta;
        this.medico = medico;
        
    }
    
    public void mostrar(){
        System.out.println("Nombre del paciente: "+ nombre);
        System.out.println("Edad del paciente: "+ edad);
        System.out.println("Medico que lo atiende: "+ medico.nombre);
        System.out.println("Especialidad del medico: "+ medico.especialidad);
        System.out.println("Motivo de la consulta: "+ motivo_consulta);
        System.out.println("Hospital en el que se atiende: "+ medico.hospital.nombre);
    }
    
    
}
