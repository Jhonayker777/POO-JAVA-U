package com.gestion.view.presenter;

import com.gestion.model.Producto;
import java.util.List;

public class ProductoPresenter {

    private static final String FORMATO = "%-5s %-15s %-25s %-8s %-12s %-12s %-15s%n";

    public String formatear(Producto p) {
        String nombreMarca = (p.getMarca() != null) ? p.getMarca().getNombre() : "—";
        return String.format(FORMATO,
                p.getId(),
                p.getNombre(),
                p.getDescripcion(),
                p.getStock(),
                p.getPrecioCompra(),
                p.getPrecioVenta(),
                nombreMarca);
    }

    public String formatearLista(List<Producto> productos) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(FORMATO,
                "ID", "NOMBRE", "DESCRIPCIÓN",
                "STOCK", "P. COMPRA", "P. VENTA", "MARCA"));
        sb.append("-".repeat(95)).append("\n");
        for (Producto p : productos) {
            sb.append(formatear(p));
        }
        return sb.toString();
    }
}