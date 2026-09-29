package com.gestion.view.console;

import com.gestion.model.Marca;
import com.gestion.view.presenter.MarcaPresenter;
import java.util.List;

public class MostrarMarca {

    private final MarcaPresenter presenter;

    public MostrarMarca(MarcaPresenter presenter) {
        this.presenter = presenter;
    }

    public void listar(List<Marca> marcas) {
        System.out.println("**********************************");
        System.out.println(presenter.formatearLista(marcas));
    }
}