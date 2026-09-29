package com.s2.parcialgimnasio;

public class Plan {

    private String nombrePlan;
    private String tipoPlan;
    private double precioMensual;
    private Gimnasio gimnasio;

    public Plan(String nombrePlan, String tipoPlan, double precioMnesual, Gimnasio gimnasio) {
        if (nombrePlan == null || nombrePlan.isBlank()) {
            throw new IllegalArgumentException(
                    "El nombre no puede estar vacío");
        }
        if (tipoPlan == null || tipoPlan.isBlank()) {
            throw new IllegalArgumentException(
                    "El tipo de plan no puede estar vacio");
        }
        if(precioMnesual <=0){
            throw new IllegalArgumentException("El precio del plan debe ser mayor que 0");
        }
        if (gimnasio == null) {
            throw new IllegalArgumentException("El gimnasio no puede estar vacio");
        }
        
        this.nombrePlan = nombrePlan;
        this.tipoPlan = tipoPlan;
        this.precioMensual = precioMnesual;
        this.gimnasio = gimnasio;
    }

    public String getNombrePlan() {
        return nombrePlan;
    }

    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    public String getTipoPlan() {
        return tipoPlan;
    }

    public void setTipoPlan(String tipoPlan) {
        this.tipoPlan = tipoPlan;
    }

    public double getPrecioMnesual() {
        return precioMensual;
    }

    public void setPrecioMnesual(double precioMnesual) {
        this.precioMensual = precioMnesual;
    }

    public Gimnasio getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(Gimnasio gimnasio) {
        this.gimnasio = gimnasio;
    }

    public void mostrar() {
        System.out.println("""
                           Plan: %s
                           Tipo de plan: %s
                           Precio mensual: %S
                           %S
                           """.formatted(nombrePlan, tipoPlan, precioMensual, gimnasio));
    }

    @Override
    public String toString() {
        return """
            ***********************PLAN*****************************
            Plan: %s
            Tipo de plan: %s
            Precio mensual: %S
            %S
            """.formatted(nombrePlan, tipoPlan, precioMensual, gimnasio);

    }

}
