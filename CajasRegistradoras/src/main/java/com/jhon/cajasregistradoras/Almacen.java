/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jhon.cajasregistradoras;

import java.util.Map;

/**
 *
 * @author jhon1
 */
public class Almacen {

    Map<String, Integer> inventario;

    public Almacen(Map<String, Integer> inventario) {
        this.inventario = inventario;
    }

    public synchronized void vender(String prodcuto, String caja) {
        Integer stock = inventario.get(prodcuto);
        if ((stock-1) >= 0) {
            inventario.put(prodcuto, stock - 1);
        } else {
            System.out.println("No se puede vender el porducto," + prodcuto);
        }

    }

    public void mostrarInventario() {
        for (Map.Entry<String, Integer> entry : inventario.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.println(key + " : " + val);
        }
    }
    
    
    
}
