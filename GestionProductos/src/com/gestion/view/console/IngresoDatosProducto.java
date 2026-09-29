package com.gestion.view.console;

import com.gestion.model.Producto;
import com.gestion.model.ProductoBuilder;
import com.gestion.view.validaciones.Entrada;

public class IngresoDatosProducto {

    private final Entrada entrada;

    public IngresoDatosProducto(Entrada entrada) {
        this.entrada = entrada;
    }

    public Producto ingresar() {
        return new ProductoBuilder()
                .nombre(entrada.texto("Ingrese el nombre del producto"))
                .descripcion(entrada.texto("Ingrese la descripción del producto"))
                .stock(entrada.enteroGrande("Ingrese el stock del producto"))
                .precioCompra(entrada.decimal("Ingrese el precio de compra"))
                .precioVenta(entrada.decimal("Ingrese el precio de venta"))
                .build();
    }
}
