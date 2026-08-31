/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.clase_poo;

/**
 *
 * @author jhon1
 */
public class Clase_POO {

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Jhonayker", 18);
        estudiante1.mostrar();

        Estudiante estudiante2 = new Estudiante("Emanuel", 18);
        estudiante2.mostrar();

        Estudiante estudiante3 = new Estudiante("Dennys", 19);
        estudiante3.mostrar();

        Universidad universidad1 = new Universidad("Universidad Tecnologica de Santander", "Bucaramanga");
        universidad1.mostrar();

        Universidad universidad2 = new Universidad("Universidad Industrial de Santander", "Bucaramanga");
        universidad2.mostrar();

        Universidad universidad3 = new Universidad("Universidad Pontificie Bolivariana", "Bucaramanga");
        universidad3.mostrar();

    }
}
