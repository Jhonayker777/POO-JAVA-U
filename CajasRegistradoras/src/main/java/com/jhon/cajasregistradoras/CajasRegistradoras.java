
package com.jhon.cajasregistradoras;

import java.util.HashMap;
import java.util.Map;

public class CajasRegistradoras {

    public static void main(String[] args) throws InterruptedException {
        Thread actual = Thread.currentThread();
        System.out.println("\nn====================MAIN===================");
        System.out.println("Id:"+actual.getId());
        System.out.println("Nombre:"+actual.getName());
        System.out.println("Prioridad:"+actual.getPriority());
        System.out.println("Estado:"+actual.getState());
        
        Map<String, Integer> inventario = new HashMap<>();
        inventario.put("ARROZ", 5);
        inventario.put("ACEITE", 2);
        inventario.put("AZUCAR", 3);
        
        Almacen almacen = new Almacen(inventario);
        
        String[] pedidosCaja1 ={"ARROZ","AZUCAR","ARROZ"};
        String[] pedidosCaja2 ={"ARROZ","ACEITE","ARROZ"};
        String[] pedidosCaja3 ={"ACEITE","AZUCAR"};
    
        Thread caja1 = new Thread(new Caja("CAJA-1", almacen, pedidosCaja1));
        Thread caja2 = new Thread(new Caja("CAJA-2", almacen, pedidosCaja2));
        Thread caja3 = new Thread(new Caja("CAJA-3", almacen, pedidosCaja3));
        
        
        caja1.setPriority(10);
        caja2.setPriority(5);
        caja3.setPriority(1);
        
        caja1.start();
        caja2.start();
        caja3.start();
        
        caja1.join();
        caja2.join();
        caja3.join();
        
        System.out.println("\n Inventario final");
        almacen.mostrarInventario();

    }
}
