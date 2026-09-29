package com.jhon.concurrencia;

public class Concurrencia {

    public static void main(String[] args) throws InterruptedException {

        Banco banco = new Banco();

        Thread e1 = new Thread(new Empleado("David", banco));

        Thread e2 = new Thread(new Empleado("Pablo", banco));

        Thread e3 = new Thread(new Empleado("Juan", banco));

        Thread e4 = new Thread(new Empleado("Maria", banco));

        Thread e5 = new Thread(new Empleado("Julian", banco));

        e1.start();

        e2.start();

        e3.start();

        e4.start();

        e5.start();

        //para iniciar y esperar que se terminen
        e1.join();

        e2.join();

        e3.join();

        e4.join();

        e5.join();

        System.out.println("Proceso terminado correctamente!");

    }

}
