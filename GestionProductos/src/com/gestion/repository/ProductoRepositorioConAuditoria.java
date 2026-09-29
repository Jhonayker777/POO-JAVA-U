package com.gestion.repository;

import com.gestion.model.Producto;
import java.util.List;

public class ProductoRepositorioConAuditoria implements IProductoRepositorio {

    private final IProductoRepositorio delegado;

    public ProductoRepositorioConAuditoria(IProductoRepositorio delegado) {
        this.delegado = delegado;
    }

    @Override
    public void guardar(Producto producto) {
        System.out.println("[AUDIT] Guardando producto: " + producto.getNombre());
        delegado.guardar(producto);
    }

    @Override
    public List<Producto> listar() {
        System.out.println("[AUDIT] Listando productos");
        return delegado.listar();
    }

    @Override
    public Producto buscarPorId(long id) {
        System.out.println("[AUDIT] Buscando producto id=" + id);
        return delegado.buscarPorId(id);
    }

    @Override
    public boolean actualizar(Producto viejo, Producto nuevo) {
        System.out.println("[AUDIT] Actualizando producto id=" + viejo.getId());
        return delegado.actualizar(viejo, nuevo);
    }

    @Override
    public boolean eliminar(long id) {
        System.out.println("[AUDIT] Eliminando producto id=" + id);
        return delegado.eliminar(id);
    }

    @Override
    public boolean listaVacia() {
        return delegado.listaVacia();
    }

    @Override
    public List<Producto> buscarPorMarca(long idMarca) {
        System.out.println("[AUDIT] Buscando productos de marca id=" + idMarca);
        return delegado.buscarPorMarca(idMarca);
    }
}