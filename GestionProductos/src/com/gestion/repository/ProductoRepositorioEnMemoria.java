package com.gestion.repository;

import com.gestion.model.Producto;
import java.util.ArrayList;
import java.util.List;

public class ProductoRepositorioEnMemoria implements IProductoRepositorio {

    private final List<Producto> productos = new ArrayList<>();

    @Override
    public void guardar(Producto producto) {
        productos.add(producto);
    }

    @Override
    public List<Producto> listar() {
        return new ArrayList<>(productos);
    }

    @Override
    public Producto buscarPorId(long id) {
        for (Producto p : productos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    @Override
    public boolean actualizar(Producto viejo, Producto nuevo) {
        int idx = productos.indexOf(viejo);
        if (idx == -1) {
            return false;
        }
        productos.set(idx, nuevo);
        return true;
    }

    @Override
    public boolean eliminar(long id) {
        return productos.removeIf(p -> p.getId() == id);
    }

    @Override
    public boolean listaVacia() {
        return productos.isEmpty();
    }

    @Override
    public List<Producto> buscarPorMarca(long idMarca) {
        List<Producto> resultado = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getMarca() != null && p.getMarca().getId() == idMarca) {
                resultado.add(p);
            }
        }
        return resultado;
    }
}