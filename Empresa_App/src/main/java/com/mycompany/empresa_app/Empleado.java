package com.mycompany.empresa_app;

public class Empleado {
    // ATRIBUTOS ENCAPSULADOS

    private String nombre;
    private String documento;
    private float salario;
    private Departamento departamento;
    // CONSTRUCTOR

    public Empleado(String nombre, String documento, float salario, Departamento departamento) {

        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El nombre no puede estar vacío");
        }
        if (documento == null || documento.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El documento no puede estar vacío");
        }
        if (salario <= 0) {
            throw new IllegalArgumentException(
                    "El salario debe ser mayor que cero");
        }

        if (departamento == null) {
            throw new IllegalArgumentException(
                    "El departamento no puede estar vacío");
        }

        //Asignación de valores
        this.nombre = nombre;
        this.documento = documento;
        this.salario = salario;
        this.departamento = departamento;

    }
    // GET Y SET DE NOMBRE

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // GET Y SET DE DOCUMENTO

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {

        this.documento = documento;
    }
    // GET Y SET DE SALARIO

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {

        this.salario = salario;
    }
    // GET Y SET DE DEPARTAMENTO

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    // MÉTODO MOSTRAR

    public void mostrarempleados() {
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Cedula del empleado: " + documento);
        System.out.println("Salario: " + salario);
        System.out.println("Departamento donde trabaja: " + departamento.getNombre()
        );
        System.out.println("Empresa donde trabaja: "
                + departamento.getEmpresa().getNombre());
    }
}
