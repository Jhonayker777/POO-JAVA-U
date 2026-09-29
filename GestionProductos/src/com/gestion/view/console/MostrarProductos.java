package com.gestion.view.console;

import com.gestion.model.Producto;
import com.gestion.view.presenter.ProductoPresenter;
import java.util.List;

public class MostrarProductos {

    private final ProductoPresenter presenter;

    public MostrarProductos(ProductoPresenter presenter) {
        this.presenter = presenter;
    }

    public void listar(List<Producto> productos) {
        System.out.println("**********************************");
        System.out.println(presenter.formatearLista(productos));
    }
}