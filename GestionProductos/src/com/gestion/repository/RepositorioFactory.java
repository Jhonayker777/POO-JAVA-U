package com.gestion.repository;

public class RepositorioFactory {

    private RepositorioFactory() {
    }

    public static IMarcaRepositorio crearMarca(TipoRepositorio tipo) {
        return switch (tipo) {
            case MEMORIA -> new MarcaRepositorioEnMemoria();
            case CON_AUDITORIA -> new MarcaRepositorioConAuditoria(
                    new MarcaRepositorioEnMemoria());
        };
    }

    public static IProductoRepositorio crearProducto(TipoRepositorio tipo) {
        return switch (tipo) {
            case MEMORIA -> new ProductoRepositorioEnMemoria();
            case CON_AUDITORIA -> new ProductoRepositorioConAuditoria(
                    new ProductoRepositorioEnMemoria());
        };
    }
}