package com.jhon.concurrencia;

public class Banco {
 
    //que los hilos dejen de actuar todos al mismo tiempo y actuen en cola. 
    public synchronized void transferir(String nombre, double monto) {
        System.out.println("Iniciando pago...");
        try {
            Thread.sleep(2000);//permite simular la conexion y gestion de pago al banco 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(nombre + " -> Pago de $" + monto + " enviado con xito!");
    }
}
