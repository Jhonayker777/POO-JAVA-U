package com.gestion.view.console;

import com.gestion.model.Marca;
import com.gestion.view.validaciones.Entrada;

public class IngresoDatosMarca {

    private final Entrada entrada;

    public IngresoDatosMarca(Entrada entrada) {
        this.entrada = entrada;
    }

    public Marca ingresar() {
        return new Marca(entrada.texto("Ingrese el nombre de la marca"));
    }

    public String pedirNombre() {
        return entrada.texto("Ingrese la nueva marca");
    }
}