package com.gestion.controller;

import com.gestion.model.Marca;
import com.gestion.model.Producto;
import com.gestion.service.MarcaService;
import com.gestion.service.ProductoService;
import com.gestion.view.console.IngresoDatosProducto;
import com.gestion.view.console.MostrarMarca;
import com.gestion.view.console.MostrarProductos;
import com.gestion.view.console.OpcionesMenus;
import com.gestion.view.validaciones.Entrada;
import java.util.List;

public class ControlProducto {

    private final ProductoService productoService;
    private final MarcaService marcaService;
    private final IngresoDatosProducto ingreso;
    private final MostrarProductos mostrarProducto;
    private final MostrarMarca mostrarMarca;
    private final OpcionesMenus opciones;
    private final Entrada entrada;

    public ControlProducto(ProductoService productoService,
                           MarcaService marcaService,
                           IngresoDatosProducto ingreso,
                           MostrarProductos mostrarProducto,
                           MostrarMarca mostrarMarca,
                           OpcionesMenus opciones,
                           Entrada entrada) {
        this.productoService = productoService;
        this.marcaService = marcaService;
        this.ingreso = ingreso;
        this.mostrarProducto = mostrarProducto;
        this.mostrarMarca = mostrarMarca;
        this.opciones = opciones;
        this.entrada = entrada;
    }

    public void menu() {
        int op;
        do {
            op = opciones.producto();
            switch (op) {
                case 1 -> registrar();
                case 2 -> actualizar();
                case 3 -> buscar();
                case 4 -> eliminar();
                case 5 -> listar();
                case 6 -> buscarPorMarca();
                case 7 -> System.out.println("Saliendo al menú principal");
                default -> System.out.println("Opcion no encontrada");
            }
        } while (op != 7);
    }

    private void registrar() {
        if (marcaService.listaVacia()) {
            opciones.imprimirMensaje("Debe registrar al menos una marca!");
            return;
        }
        Producto datos = ingreso.ingresar();
        mostrarMarca.listar(marcaService.obtenerTodas());
        Marca marca = pedirMarcaExistente();
        productoService.registrar(
                datos.getNombre(),
                datos.getDescripcion(),
                datos.getStock(),
                datos.getPrecioCompra(),
                datos.getPrecioVenta(),
                marca);
        opciones.imprimirMensaje("Producto registrado correctamente!");
    }

    private Marca pedirMarcaExistente() {
        while (true) {
            long id = entrada.enteroGrande("Ingrese el Id de la marca del producto");
            Marca m = marcaService.buscarPorId(id);
            if (m != null) {
                return m;
            }
            opciones.imprimirMensaje("Id no encontrado, intente nuevamente!");
        }
    }

    private void actualizar() {
        if (productoService.listaVacia()) {
            opciones.imprimirMensaje("No hay productos para actualizar");
            return;
        }
        mostrarProducto.listar(productoService.obtenerTodos());
        long id = entrada.enteroGrande("Ingrese el Id a actualizar");
        Producto datos = ingreso.ingresar();
        Producto viejo = productoService.buscarPorId(id);
        if (viejo == null) {
            opciones.imprimirMensaje("No se encontró el producto con ese Id");
            return;
        }
        datos.setMarca(viejo.getMarca());
        boolean ok = productoService.actualizar(id, datos);
        opciones.imprimirMensaje(ok
                ? "Producto actualizado correctamente"
                : "Error al actualizar el producto");
    }

    private void buscar() {
        mostrarProducto.listar(productoService.obtenerTodos());
        long id = entrada.enteroGrande("Ingrese el Id a buscar");
        Producto p = productoService.buscarPorId(id);
        System.out.println(p == null ? "Producto no existe" : p);
    }

    private void eliminar() {
        mostrarProducto.listar(productoService.obtenerTodos());
        long id = entrada.enteroGrande("Ingrese el Id a eliminar");
        boolean ok = productoService.eliminar(id);
        opciones.imprimirMensaje(ok
                ? "Producto eliminado correctamente!"
                : "El id del producto a eliminar no se encontró!");
    }

    private void listar() {
        mostrarProducto.listar(productoService.obtenerTodos());
    }

    private void buscarPorMarca() {
        mostrarMarca.listar(marcaService.obtenerTodas());
        long id = entrada.enteroGrande("Ingrese el id de la marca a buscar");
        Marca m = marcaService.buscarPorId(id);
        if (m == null) {
            opciones.imprimirMensaje("La marca no existe");
            return;
        }
        List<Producto> filtrados = productoService.buscarPorMarca(m.getId());
        if (filtrados.isEmpty()) {
            opciones.imprimirMensaje("No hay productos de esa marca");
        } else {
            mostrarProducto.listar(filtrados);
        }
    }
}