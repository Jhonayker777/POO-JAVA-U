package com.mycompany.empresa_app;

public class Empresa {

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

    private String nombre;
    private String nit;
    private String ciudad;

    public Empresa(String nombre, String nit, String ciudad) {

        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser vacio");
        }

        if (nit == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nit no puede ser vacio");
        }

        if (ciudad == null) {
            throw new IllegalArgumentException("La ciudad no puede estar vacia");
        }

        this.nombre = nombre;
        this.nit = nit;
        this.ciudad = ciudad;
    }

    public void mostrar() {
        System.out.println("Nombre de la emprsa: " + nombre);
        System.out.println("Nombre de la ciudad de la empresa : " + ciudad);
        System.out.println("nit de la ciudad : " + nit);

    }

}
