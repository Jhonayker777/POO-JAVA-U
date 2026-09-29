package com.gestion.repository;

public class GeneradorId {

    private long ultimoId = 0;

    public long siguiente() {
        return ++ultimoId;
    }
}