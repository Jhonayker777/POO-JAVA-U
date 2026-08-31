/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salud;

/**
 *
 * @author jhon1
 */
public class Salud {

    public static void main(String[] args) {
        Hospital hospital1 = new Hospital("Nueva eps","Bucaramanga");
        
        Medico medico1 = new Medico("Juan", "Cirujano",hospital1);
        Medico medico2 = new Medico("Carlos","Odontologo",hospital1);
        Medico medico3 = new Medico("Esteban","Fisioterapeuta",hospital1);
        
        Paciente paciente1 = new Paciente("Ali",20,"Cirugia de corazón",medico1);
        Paciente paciente2 = new Paciente("Mike",31,"Extraccion de cordales",medico2);
        Paciente paciente3 = new Paciente("Emmanuel",45,"Revision general",medico3);
        
        paciente1.mostrar();
        System.out.println("-----------------------------------------");
        paciente2.mostrar();
        System.out.println("-----------------------------------------");
        paciente3.mostrar();

        
    }
}
