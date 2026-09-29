package com.gestion.repository;

import com.gestion.model.Marca;
import java.util.List;

public interface IMarcaRepositorio {
    void guardar(Marca marca);
    List<Marca> listar();
    Marca buscarPorId(long id);
    boolean actualizar(Marca vieja, Marca nueva);
    boolean eliminar(long id);
    boolean listaVacia();
}