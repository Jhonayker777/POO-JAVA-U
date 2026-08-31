/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.empresa_app;

/**
 *
 * @author jhon1
 */
public class Empresa_App {

    public static void main(String[] args) {
        try {
            Empresa empresa1 = new Empresa("UTS", "000.123.213", "Bucaramanga");

            Departamento departamento1 = new Departamento("Bienestar del estudiante", "001", empresa1);
            Departamento departamento2 = new Departamento("cONTRATACION", "002", empresa1);
            Departamento departamento3 = new Departamento("Nomina", "003", empresa1);

            Empleado empleado1 = new Empleado("Emmanuel", "1099101776", 1200000, departamento1);
            Empleado empleado2 = new Empleado("Dennis", "11254836912", 7000000, departamento2);
            Empleado empleado3 = new Empleado("Alucard", "1126905083", 12000000, departamento3);

            empleado1.mostrar();
            System.out.println("---------------");
            empleado2.mostrar();
            System.out.println("---------------");
            empleado3.mostrar();
        } catch (IllegalArgumentException e) {
            System.out.println("Error" + e.getMessage());
        }

    }
}
