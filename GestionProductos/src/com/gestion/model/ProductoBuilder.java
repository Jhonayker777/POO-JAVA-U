package com.gestion.model;

public class ProductoBuilder {

    private long id;
    private String nombre;
    private String descripcion;
    private long stock;
    private double precioCompra;
    private double precioVenta;
    private Marca marca;

    public ProductoBuilder id(long id) {
        this.id = id;
        return this;
    }

    public ProductoBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ProductoBuilder descripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public ProductoBuilder stock(long stock) {
        this.stock = stock;
        return this;
    }

    public ProductoBuilder precioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
        return this;
    }

    public ProductoBuilder precioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
        return this;
    }

    public ProductoBuilder marca(Marca marca) {
        this.marca = marca;
        return this;
    }

    public Producto build() {
        return new Producto(id, nombre, descripcion, stock,
                precioCompra, precioVenta, marca);
    }
}