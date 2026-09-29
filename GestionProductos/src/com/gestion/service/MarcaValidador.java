package com.gestion.service;

import com.gestion.model.Marca;

public class MarcaValidador implements Validador<Marca> {

    @Override
    public void validar(Marca marca) {
        if (marca.getNombre() == null || marca.getNombre().trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre de la marca no puede estar vacío");
        }
        if (marca.getNombre().length() > 50) {
            throw new IllegalArgumentException("El nombre de la marca no puede superar 50 caracteres");
        }
    }
}