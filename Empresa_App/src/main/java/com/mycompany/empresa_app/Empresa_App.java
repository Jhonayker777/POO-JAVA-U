package com.mycompany.empresa_app;

public class Empresa_App {

    public static void main(String[] args) {
        // Declaración de variables
        Empresa empresa1 = null;
        Departamento departamento1 = null;
        Departamento departamento2 = null;
        Empleado empleado1 = null;
        Empleado empleado2 = null;
        Empleado empleado3 = null;
        // ==========================================
        // CREAR EMPRESA
        // ==========================================
        try {
            empresa1 = new Empresa("ALPINA", "800.154.235-8", "Bogota");
            System.out.println("-------------------------");
            empresa1.mostrar();
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR EMPRESA: " + e.getMessage());
        }
        // ==========================================
        // CREAR DEPARTAMENTO 1
        // ==========================================
        if (empresa1 != null) {
            try {
                departamento1 = new Departamento("Sistrmas", "A001", empresa1);
            } catch (IllegalArgumentException e) {
                System.out.println("ERROR DEPARTAMENTO 1: " + e.getMessage());
            }
        } else {
            System.out.println("No se puede crear el departamento " + "porque la empresa noexiste.");
        }
        // ==========================================
        // CREAR DEPARTAMENTO 2
        // ==========================================
        if (empresa1 != null) {
            try {
                departamento2 = new Departamento("Contabilidad", "B001", empresa1);
            } catch (IllegalArgumentException e) {
                System.out.println("ERROR DEPARTAMENTO 2: " + e.getMessage());
            }
        }
        // ==========================================
        // AGREGAR DEPARTAMENTOS A LA EMPRESA
        // ==========================================
        if (empresa1 != null) {
            try {
                if (departamento1 != null) {
                    empresa1.agregarDepartamento(
                            departamento1);
                }
                if (departamento2 != null) {
                    empresa1.agregarDepartamento(
                            departamento2);
                }
                System.out.println("-------------------------");
                empresa1.mostrarDepartamentos();
            } catch (IllegalArgumentException e) {
                System.out.println("ERROR AL AGREGAR DEPARTAMENTO: "
                        + e.getMessage());
            }
        }
        // ==========================================
        // CREAR EMPLEADO 1
        // ==========================================
        if (departamento1 != null) {
            try {
                empleado1 = new Empleado("Juan", "1098765432", 2500000, departamento1);
            } catch (IllegalArgumentException e) {
                System.out.println("ERROR EMPLEADO 1: " + e.getMessage());
            }
        }
        // ==========================================
        // CREAR EMPLEADO 2
        // ==========================================
        if (departamento1 != null) {
            try {
                empleado2 = new Empleado("Pablo", "77777", 1800000, departamento1);
            } catch (IllegalArgumentException e) {
                System.out.println("ERROR EMPLEADO 2: " + e.getMessage());
            }
        }
        // ==========================================
        // CREAR EMPLEADO 3
        // ==========================================
        if (departamento2 != null) {
            try {
                empleado3 = new Empleado("Sandra", "66666", 2200000, departamento2);
            } catch (IllegalArgumentException e) {
                System.out.println("ERROR EMPLEADO 3: " + e.getMessage());
            }
        }
        // ==========================================
        // AGREGAR EMPLEADOS
        // ==========================================
        try {
            if (departamento1 != null
                    && empleado1 != null) {
                departamento1.agregarEmpleado(empleado1);
            }
            if (departamento1 != null
                    && empleado2 != null) {
                departamento1.agregarEmpleado(empleado2);
            }
            if (departamento2 != null
                    && empleado3 != null) {
                departamento2.agregarEmpleado(empleado3);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR AL AGREGAR EMPLEADO: " + e.getMessage());
        }
        // ==========================================
        // MOSTRAR EMPLEADOS
        // ==========================================
        if (departamento1 != null) {
            System.out.println("-------------------------");
            departamento1.mostrarEmpleados();
        }
        if (departamento2 != null) {
            System.out.println("-------------------------");
            departamento2.mostrarEmpleados();
        }
    }
}
