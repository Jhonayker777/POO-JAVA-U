package com.gestion.controller;

import com.gestion.view.console.OpcionesMenus;

public class Principal {

    private final OpcionesMenus opciones;
    private final ControlMarca controlMarca;
    private final ControlProducto controlProducto;

    public Principal(OpcionesMenus opciones,
                     ControlMarca controlMarca,
                     ControlProducto controlProducto) {
        this.opciones = opciones;
        this.controlMarca = controlMarca;
        this.controlProducto = controlProducto;
    }

    public void menuPrincipal() {
        int op;
        do {
            op = opciones.general();
            switch (op) {
                case 1 -> controlMarca.menu();
                case 2 -> controlProducto.menu();
                case 3 -> System.out.println("Gracias por usar nuestra aplicación!");
                default -> System.out.println("Opcion no encontrada");
            }
        } while (op != 3);
    }
}