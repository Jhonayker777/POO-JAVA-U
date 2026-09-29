package com.gestion.service;

import com.gestion.model.Marca;
import com.gestion.model.Producto;
import com.gestion.model.ProductoBuilder;
import com.gestion.repository.GeneradorId;
import com.gestion.repository.IProductoRepositorio;
import java.util.List;

public class ProductoService {

    private final IProductoRepositorio repositorio;
    private final GeneradorId generadorId;
    private final Validador<Producto> validador;

    public ProductoService(IProductoRepositorio repositorio,
            GeneradorId generadorId,
            Validador<Producto> validador) {
        this.repositorio = repositorio;
        this.generadorId = generadorId;
        this.validador = validador;
    }

    public Producto registrar(String nombre, String descripcion, long stock,
            double precioCompra, double precioVenta, Marca marca) {
        Producto p = new ProductoBuilder()
                .id(generadorId.siguiente())
                .nombre(nombre)
                .descripcion(descripcion)
                .stock(stock)
                .precioCompra(precioCompra)
                .precioVenta(precioVenta)
                .marca(marca)
                .build();
        validador.validar(p);
        repositorio.guardar(p);
        return p;
    }

    public List<Producto> obtenerTodos() {
        return repositorio.listar();
    }

    public Producto buscarPorId(long id) {
        return repositorio.buscarPorId(id);
    }

    public boolean actualizar(long id, Producto datos) {
        Producto viejo = repositorio.buscarPorId(id);
        if (viejo == null) {
            return false;
        }
        Producto nuevo = new ProductoBuilder()
                .id(id)
                .nombre(datos.getNombre())
                .descripcion(datos.getDescripcion())
                .stock(datos.getStock())
                .precioCompra(datos.getPrecioCompra())
                .precioVenta(datos.getPrecioVenta())
                .marca(datos.getMarca())
                .build();
        validador.validar(nuevo);
        return repositorio.actualizar(viejo, nuevo);
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

    public List<Producto> buscarPorMarca(long idMarca) {
        return repositorio.buscarPorMarca(idMarca);
    }
}
