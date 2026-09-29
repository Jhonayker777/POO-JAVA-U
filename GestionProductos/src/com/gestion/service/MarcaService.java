package com.gestion.service;

import com.gestion.model.Marca;
import com.gestion.repository.GeneradorId;
import com.gestion.repository.IMarcaRepositorio;
import java.util.List;

public class MarcaService {

    private final IMarcaRepositorio repositorio;
    private final GeneradorId generadorId;
    private final Validador<Marca> validador;

    public MarcaService(IMarcaRepositorio repositorio,
                        GeneradorId generadorId,
                        Validador<Marca> validador) {
        this.repositorio = repositorio;
        this.generadorId = generadorId;
        this.validador = validador;
    }

    public Marca registrar(String nombre) {
        Marca marca = new Marca(generadorId.siguiente(), nombre);
        validador.validar(marca);
        repositorio.guardar(marca);
        return marca;
    }

    public List<Marca> obtenerTodas() {
        return repositorio.listar();
    }

    public Marca buscarPorId(long id) {
        return repositorio.buscarPorId(id);
    }

    public boolean actualizar(long id, String nuevoNombre) {
        Marca vieja = repositorio.buscarPorId(id);
        if (vieja == null) {
            return false;
        }
        Marca nueva = new Marca(id, nuevoNombre);
        validador.validar(nueva);
        return repositorio.actualizar(vieja, nueva);
    }

    public boolean eliminar(long id) {
        if (repositorio.buscarPorId(id) == null) {
            return false;
        }
        return repositorio.eliminar(id);
    }

    public boolean listaVacia() {
        return repositorio.listaVacia();
    }
}