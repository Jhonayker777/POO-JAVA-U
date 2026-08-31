/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresa_app;

/**
 *
 * @author jhon1
 */
public class Empleado {

    String nombre;
    String documento;
    float salario;
    Departamento departamento;

    public Empleado(String nombre, String documento, float salario, Departamento departamento) {

        this.documento = documento;
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = departamento;
    }

    public void mostrar() {
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Docuemtno del empleado: " + documento);
        System.out.println("Salario del empleado:" + salario);
        System.out.println("Departamento del empleado :" + departamento.nombre);// Nombre del departamento
        System.out.println("Empresa a la que pertenece: " + departamento.empresa.nombre);//Nombre de la empresa

    }

}
