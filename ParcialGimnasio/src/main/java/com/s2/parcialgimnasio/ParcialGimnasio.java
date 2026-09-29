package com.s2.parcialgimnasio;

/**
 * @author Jhonayker Alexander Quintero Olarte
 */
public class ParcialGimnasio {

    public static void main(String[] args) {
        Gimnasio gimnasio1 = null;
        Plan plan1 = null;
        Plan plan2 = null;
        Usuario usuario1 = null;
        Usuario usuario2 = null;

        try {
            gimnasio1 = new Gimnasio("Olimpo", "Bucaramanga", 2);
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR GIMNASIO: " + e.getMessage());

        }
        try {
            plan1 = new Plan("Odisea", "Premiun", 55000, gimnasio1);
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR PLAN1: " + e.getMessage());
        }

        try {
            plan2 = new Plan("Atenena", "Basico", 55000, gimnasio1);
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR PLAN2: " + e.getMessage());
        }

        try {
            usuario1 = new Usuario("jhonayker", "12345679", 18, plan1);
            System.out.println("-------------------------");
            usuario1.mostrar();
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR USUARIO1: " + e.getMessage());
        }

        try {
            usuario2 = new Usuario("Emmanuel", "97654321", 17, plan2);
            System.out.println("-------------------------");
            usuario2.mostrar();
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR USUARIO2: " + e.getMessage());
        }
   
    }
}
