package com.mycompany.empresa_app;

public class Empresa_App {

    public static void main(String[] args) {
        Empresa empresa1 = null;
        
        Departamento departamento1 = null;
        Departamento departamento2 = null;
        Departamento departamento3 = null;

       
        try {
            empresa1 = new Empresa("UTS", "000.123.213", "Bucaramanga");
            empresa1.mostrar();
        } catch (IllegalArgumentException e) {
            System.out.println("Error creando empresa: " + e.getMessage());
            return; 
        }
        System.out.println("");
        try {
            departamento1 = new Departamento("Bienestar del estudiante", "001", empresa1);
            departamento1.mostrar();
        } catch (IllegalArgumentException e) {
            System.out.println("Error creando departamento1: " + e.getMessage());
        }
        System.out.println("");
        try {
            departamento2 = new Departamento("Contratacion", "002", empresa1); 
            departamento2.mostrar();
        } catch (IllegalArgumentException e) {
            System.out.println("Error creando departamento2: " + e.getMessage());
        }
        System.out.println("");
        try {
            departamento3 = new Departamento("Nomina", "003", empresa1);
            departamento3.mostrar();
        } catch (IllegalArgumentException e) {
            System.out.println("Error creando departamento3: " + e.getMessage());
        }

  
        if (departamento1 != null) {
            try {
                Empleado empleado1 = new Empleado("Emmanuel", "1099101776", 1200000, departamento1);
                empleado1.mostrar();
            } catch (IllegalArgumentException e) {
                System.out.println("Error creando empleado1: " + e.getMessage());
            }
        } else {
            System.out.println("No se pudo crear empleado1: departamento1 es nulo");
        }

        if (departamento2 != null) {
            try {
                Empleado empleado2 = new Empleado("Estebasn", "11254836912", 7000000, departamento2);
                empleado2.mostrar();
            } catch (IllegalArgumentException e) {
                System.out.println("Error creando empleado2: " + e.getMessage());
            }
        } else {
            System.out.println("No se pudo crear empleado2: departamento2 es nulo");
        }
        System.out.println("");
        if (departamento3 != null) {
            try {
                Empleado empleado3 = new Empleado("Alucard", "1126905083", 12000000, departamento3);
                empleado3.mostrar();
            } catch (IllegalArgumentException e) {
                System.out.println("Error creando empleado3: " + e.getMessage());
            }
        } else {
            System.out.println("No se pudo crear empleado3: departamento3 es nulo");
        }

    }
}