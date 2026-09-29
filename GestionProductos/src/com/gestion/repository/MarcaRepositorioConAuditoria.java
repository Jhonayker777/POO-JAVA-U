package com.gestion.repository;

import com.gestion.model.Marca;
import java.util.List;

public class MarcaRepositorioConAuditoria implements IMarcaRepositorio {

    private final IMarcaRepositorio delegado;

    public MarcaRepositorioConAuditoria(IMarcaRepositorio delegado) {
        this.delegado = delegado;
    }

    @Override
    public void guardar(Marca marca) {
        System.out.println("[AUDIT] Guardando marca: " + marca.getNombre());
        delegado.guardar(marca);
    }

    @Override
    public List<Marca> listar() {
        System.out.println("[AUDIT] Listando marcas");
        return delegado.listar();
    }

    @Override
    public Marca buscarPorId(long id) {
        System.out.println("[AUDIT] Buscando marca con id=" + id);
        return delegado.buscarPorId(id);
    }

    @Override
    public boolean actualizar(Marca vieja, Marca nueva) {
        System.out.println("[AUDIT] Actualizando marca id=" + vieja.getId());
        return delegado.actualizar(vieja, nueva);
    }

    @Override
    public boolean eliminar(long id) {
        System.out.println("[AUDIT] Eliminando marca id=" + id);
        return delegado.eliminar(id);
    }

    @Override
    public boolean listaVacia() {
        return delegado.listaVacia();
    }
}