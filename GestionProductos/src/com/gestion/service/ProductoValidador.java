package com.gestion.service;

import com.gestion.model.Producto;

public class ProductoValidador implements Validador<Producto> {

    @Override
    public void validar(Producto p) {
        if (p.getNombre() == null || p.getNombre().trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del producto no puede estar vacío");
        }
        if (p.getDescripcion() == null || p.getDescripcion().trim().isEmpty()) {
            throw new IllegalArgumentException("La descripción del producto no puede estar vacía");
        }
        if (p.getStock() < 0) {
            throw new IllegalArgumentException("El stock no puede ser negativo");
        }
        if (p.getPrecioCompra() < 0 || p.getPrecioVenta() < 0) {
            throw new IllegalArgumentException("Los precios no pueden ser negativos");
        }
        if (p.getPrecioVenta() < p.getPrecioCompra()) {
            throw new IllegalArgumentException("El precio de venta no puede ser menor al de compra");
        }
        if (p.getMarca() == null) {
            throw new IllegalArgumentException("El producto debe tener una marca asignada");
        }
    }
}