package com.gestion.view.presenter;

import com.gestion.model.Marca;
import java.util.List;

public class MarcaPresenter {

    private static final String FORMATO = "%-5s %-25s%n";

    public String formatear(Marca m) {
        return String.format(FORMATO, m.getId(), m.getNombre());
    }

    public String formatearLista(List<Marca> marcas) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(FORMATO, "ID", "NOMBRE"));
        sb.append("-".repeat(32)).append("\n");
        for (Marca m : marcas) {
            sb.append(formatear(m));
        }
        return sb.toString();
    }
}