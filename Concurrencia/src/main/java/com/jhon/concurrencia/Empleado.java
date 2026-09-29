package com.jhon.concurrencia;
public class Empleado implements Runnable{
 
    private String nombre;
    private Banco banco;
 
    public Empleado(String nombre, Banco banco) {
        this.nombre = nombre;
        this.banco = banco;
    }
 
    double calcularSalario(){
        return Math.round(Math.random() * 3000000 + 5000000);
    }
    @Override
    public void run() {
        System.out.println("Iniciando jejeje");
        double salario=calcularSalario();
        System.out.println("Iniciando pago...");
        try {
            Thread.sleep(2000);//permite simular la conexion y gestion de pago al banco 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(nombre + " -> Pago de $" + salario + " enviado con xito!");
 
//        banco.transferir(nombre, salario); //dejamos que cada hilo deje de ejecutarse al mismo 
                                           //tiempo y haga su respectiva accion.
        System.out.println("Transferencia realizada con exito!");
    }
}
