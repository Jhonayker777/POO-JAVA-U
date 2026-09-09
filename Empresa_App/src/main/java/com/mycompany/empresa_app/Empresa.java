package com.mycompany.empresa_app;

//Importa la clase ArrayList de Java. La necesitas porque vas a guardar varios objetos
//Departamento dentro de una lista.
import java.util.ArrayList;

public class Empresa {

    private String nombre;
    private String nit;
    private String ciudad;

    
    private ArrayList<Departamento> departamentos;

    public Empresa(String nombre, String nit, String ciudad) {
        if (nombre == null || nombre.trim().isEmpty()) {
            
            throw new IllegalArgumentException(
                    "El nombre de la empresa no puede estar vacío");
        }
        if (nit == null || nit.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El nit de la empresa no puede estar vacío");
        }
        if (ciudad == null || ciudad.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "La ciudad de la empresa no puede estar vacía");
        }
        this.nombre = nombre;
        this.nit = nit;
        this.ciudad = ciudad;
        
        departamentos = new ArrayList<>();
    }

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
    

    public void agregarDepartamento(Departamento departamento) {
        if (departamento == null) {
            throw new IllegalArgumentException(
                    "El departamento no puede ser nulo");
        }
        //Agregar un elemento al ArrayList.
        departamentos.add(departamento);
    }

    public void mostrarDepartamentos() {
        System.out.println("Departamentos de la empresa " + nombre + ":");
        for (Departamento departamento : departamentos) {
            System.out.println("- " + departamento.getNombre());
        }
    }

    public void mostrar() {
        System.out.println(
                "Nombre de la empresa: " + nombre);
        System.out.println(
                "Nit de la empresa: " + nit);
        System.out.println(
                "Ciudad: " + ciudad);
    }
}
