package com.gestion.view.console;

import com.gestion.view.validaciones.Entrada;

public class OpcionesMenus {

    private final Entrada entrada;

    public OpcionesMenus(Entrada entrada) {
        this.entrada = entrada;
    }

    public void imprimirMensaje(String mensaje) {
        System.out.println("""
                           ===========Mensaje por consola=============
                            %s
                           ===========================================
                           """.formatted(mensaje));
    }

    public int general() {
        return entrada.entero("""
                              1- Marca.
                              2- Producto.
                              3- Salir.
                              """);
    }

    public int marca() {
        return entrada.entero("""
                              1- Agregar.
                              2- Actualizar.
                              3- Buscar.
                              4- Eliminar.
                              5- Listar.
                              6- Salir.
                              """);
    }

    public int producto() {
        return entrada.entero("""
                              1- Agregar.
                              2- Actualizar.
                              3- Buscar.
                              4- Eliminar.
                              5- Listar.
                              6- Buscar por marca.
                              7- Salir.
                              """);
    }
}