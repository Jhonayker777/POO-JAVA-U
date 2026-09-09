package com.mycompany.empresa_app;

import java.util.ArrayList;

public class Departamento {

    private String nombre;
    private String codigo;
    private Empresa empresa;
    
    private ArrayList<Empleado> empleados;

    public Departamento(String nombre, String codigo, Empresa empresa) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El nombre no puede estar vacío");
        }
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El codigo no puede estar vacío");
        }
        if (empresa == null) {
            throw new IllegalArgumentException(
                    "La empresa no puede estar vacía");
        }
        this.nombre = nombre;
        this.codigo = codigo;
        this.empresa = empresa;
        empleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void agregarEmpleado(Empleado empleado) {
        if (empleado == null) {
            throw new IllegalArgumentException(
                    "El empleado no puede ser nulo");
        }
        empleados.add(empleado);
    }

    public void mostrarEmpleados() {
        System.out.println("Empleados del departamento " + nombre + ":");
        for (Empleado empleado : empleados) {
            System.out.println("- " + empleado.getNombre());
        }
    }

    public void mostrardepartamento() {
        System.out.println(
                "Nombre del Departamento: " + nombre);
        System.out.println(
                "Codigo del Departamento: " + codigo);
        System.out.println(
                "Nombre de la empresa: " + empresa.getNombre());
    }
}
