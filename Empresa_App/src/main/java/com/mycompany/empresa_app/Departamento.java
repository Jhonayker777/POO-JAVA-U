/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresa_app;

/**
 *
 * @author jhon1
 */
public class Departamento {

    String nombre;
    String codigo;
    Empresa empresa;

    public Departamento(String nombre, String codigo, Empresa empresa) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.empresa = empresa;
    }

    public void mostrar() {
        System.out.println("Nombre del departamento: " + nombre);
        System.out.println("Codigo de la ciudad" + codigo);
        System.out.println("Nombre de la empresa: " + empresa.nombre);
    }

}
