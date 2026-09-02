package com.mycompany.empresa_app;

public class Departamento {

    private String nombre;
    private String codigo;
    private Empresa empresa;

    public Departamento(String nombre, String codigo, Empresa empresa) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser vacio");
        }

        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("El codigo de la ciudad no puede ser vacio");
        }
        if (empresa == null) {
            throw new IllegalArgumentException("La empresa no puede estar vacia");
        }

        this.codigo = codigo;
        this.nombre = nombre;
        this.empresa = empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public void mostrar() {
        System.out.println("Nombre del departamento: " + nombre);
        System.out.println("Codigo de la ciudad" + codigo);
        System.out.println("Nombre de la empresa: " + empresa.getNombre());
    }

}
