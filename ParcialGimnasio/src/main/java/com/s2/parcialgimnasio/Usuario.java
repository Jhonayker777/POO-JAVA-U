package com.s2.parcialgimnasio;

public class Usuario {

    private String nombre;
    private String documento;
    private int edad;
    private Plan plan;
    
    public Usuario(String nombre, String documento, int edad, Plan plan) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException(
                    "El nombre no puede estar vacío");
        }
        if (documento == null || nombre.isBlank()) {
            throw new IllegalArgumentException(
                    "El documento no puede estar vacio");
        }
        if(edad <=0){
            throw new IllegalArgumentException("La edad no puede menor que 0");
        }
        if(plan == null){
            throw new IllegalArgumentException("El plan no puede estar nulo");
        }
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.plan = plan;
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
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public Plan getPlan() {
        return plan;
    }
    
    public void setPlan(Plan plan) {
        this.plan = plan;
    }
    
    public void mostrar() {
        System.out.println("""
                           Nombre: %S
                           Documento: %S
                           edad: %S
                           %S                           
                           """.formatted(nombre, documento, edad,plan));
    }
}
