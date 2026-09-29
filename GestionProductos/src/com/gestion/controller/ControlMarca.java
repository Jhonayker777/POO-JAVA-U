package com.gestion.controller;

import com.gestion.model.Marca;
import com.gestion.service.MarcaService;
import com.gestion.view.console.IngresoDatosMarca;
import com.gestion.view.console.MostrarMarca;
import com.gestion.view.console.OpcionesMenus;
import com.gestion.view.validaciones.Entrada;

public class ControlMarca {

    private final MarcaService service;
    private final IngresoDatosMarca ingreso;
    private final MostrarMarca mostrar;
    private final OpcionesMenus opciones;
    private final Entrada entrada;

    public ControlMarca(MarcaService service,
            IngresoDatosMarca ingreso,
            MostrarMarca mostrar,
            OpcionesMenus opciones,
            Entrada entrada) {
        this.service = service;
        this.ingreso = ingreso;
        this.mostrar = mostrar;
        this.opciones = opciones;
        this.entrada = entrada;
    }

    public void menu() {
        int op;
        do {
            op = opciones.marca();
            switch (op) {
                case 1 ->
                    registrar();
                case 2 ->
                    actualizar();
                case 3 ->
                    buscar();
                case 4 ->
                    eliminar();
                case 5 ->
                    listar();
                case 6 ->
                    System.out.println("Regresando al menu...");
                default ->
                    System.out.println("Opcion no encontrada");
            }
        } while (op != 6);
    }

    private void registrar() {
        Marca marca = ingreso.ingresar();
        service.registrar(marca.getNombre());
        opciones.imprimirMensaje("Marca registrada correctamente!");
    }

    private void actualizar() {
        if (service.listaVacia()) {
            opciones.imprimirMensaje("No hay marcas para actualizar");
            return;
        }
        mostrar.listar(service.obtenerTodas());
        long id = entrada.enteroGrande("Ingrese el Id a actualizar");
        String nuevo = ingreso.pedirNombre();
        boolean ok = service.actualizar(id, nuevo);
        opciones.imprimirMensaje(ok
                ? "Marca actualizada correctamente!"
                : "No se encontró la marca con ese Id");
    }

    private void buscar() {
        mostrar.listar(service.obtenerTodas());
        long id = entrada.enteroGrande("Ingrese el Id a buscar");
        Marca m = service.buscarPorId(id);
        System.out.println(m == null ? "Marca no existe" : m);
    }

    private void eliminar() {
        mostrar.listar(service.obtenerTodas());
        long id = entrada.enteroGrande("Ingrese el Id a eliminar");
        boolean ok = service.eliminar(id);
        opciones.imprimirMensaje(ok
                ? "Marca eliminada correctamente!"
                : "El id de la marca a eliminar no se encontró!");
    }

    private void listar() {
        mostrar.listar(service.obtenerTodas());
    }
}
