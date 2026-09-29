package com.s2.parcialgimnasio;

public class Gimnasio {

    private String nombre;
    private String ciudad;
    private int numeroSedes;

    public Gimnasio(String nombre, String ciudad, int numeroSedes) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El nombre no puede estar vacío");
        }
        if (ciudad == null || ciudad.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El nombre no puede estar vacío");
        }
        if(numeroSedes <=0){
            throw new IllegalArgumentException("el numero de sedes debe ser positivo");
        }
        
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.numeroSedes = numeroSedes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getNumeroSedes() {
        return numeroSedes;
    }

    public void setNumeroSedes(int numeroSedes) {
        this.numeroSedes = numeroSedes;
    }

    public void mostrar() {
        System.out.println("""
                           Nombre %s
                           Ciudad: %s
                           Numero de sedes: %s
                           """.formatted(nombre, ciudad, numeroSedes));
    }

    @Override
    public String toString() {
        return """
            ********************GIMNASIO***********************
            Nombre %s
            Ciudad: %s
            Numero de sedes: %s
            """.formatted(nombre, ciudad, numeroSedes);
    }
    
    

}
