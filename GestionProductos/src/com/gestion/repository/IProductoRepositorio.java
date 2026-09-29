package com.gestion.repository;

import com.gestion.model.Producto;
import java.util.List;

public interface IProductoRepositorio {
    void guardar(Producto producto);
    List<Producto> listar();
    Producto buscarPorId(long id);
    boolean actualizar(Producto viejo, Producto nuevo);
    boolean eliminar(long id);
    boolean listaVacia();
    List<Producto> buscarPorMarca(long idMarca);
}