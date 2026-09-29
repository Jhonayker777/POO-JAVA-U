package com.jhon.cajasregistradoras;

public class Caja implements Runnable{
    private String nombre;
    private Almacen almacen;
    private String[] pedidos;

    public Caja(String nombre, Almacen almacen, String[] pedidos) {
        this.nombre = nombre;
        this.almacen = almacen;
        this.pedidos = pedidos;
    }

    
    
    @Override
    public void run() {
        Thread actual = Thread.currentThread();
        System.out.println("\nn===================="+nombre+"===================");
        System.out.println("Id:"+actual.getId());
        System.out.println("Nombre:"+actual.getName());
        System.out.println("Prioridad:"+actual.getPriority());
        System.out.println("Estado:"+actual.getState());
        
        
        for (int i = 0; i < pedidos.length; i++) {
            almacen.vender(pedidos[i], nombre);
            try {
               Thread.sleep(500);
            } catch (Exception e) {
            }
            
        }
        System.out.println(nombre+"Caja termino su turno");
        
    }
    
    
    
}
