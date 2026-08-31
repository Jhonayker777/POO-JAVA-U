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
    
    private String nombre;
    private String documento;
    private float salario;
    private Departamento departamento;

    public Empleado(String nombre, String documento, float salario, Departamento departamento) {

        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El documento no puede estar vacio");
        }

        if (documento == null || documento.trim().isEmpty()) {
            throw new IllegalArgumentException("El documento no puede ser vacio");
        }
        
        if(salario<=0){
            throw new IllegalArgumentException("Su salario no puede ser negativo");
        }
        
        if (departamento == null){
            throw new IllegalArgumentException("Departamento no puede ser nulo");
        }

        this.documento = documento;
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public void mostrar() {
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Docuemtno del empleado: " + documento);
        System.out.println("Salario del empleado:" + salario);
        System.out.println("Departamento del empleado :" + departamento.getNombre());// Nombre del departamento
        System.out.println("Empresa a la que pertenece: " + departamento.getEmpresa().getNombre());//Nombre de la empresa

    }


}
