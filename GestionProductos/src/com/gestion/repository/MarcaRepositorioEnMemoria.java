package com.gestion.repository;

import com.gestion.model.Marca;
import java.util.ArrayList;
import java.util.List;

public class MarcaRepositorioEnMemoria implements IMarcaRepositorio {

    private final List<Marca> marcas = new ArrayList<>();

    @Override
    public void guardar(Marca marca) {
        marcas.add(marca);
    }

    @Override
    public List<Marca> listar() {
        return new ArrayList<>(marcas); 
    }

    @Override
    public Marca buscarPorId(long id) {
        for (Marca m : marcas) {
            if (m.getId() == id) {
                return m;
            }
        }
        return null;
    }

    @Override
    public boolean actualizar(Marca vieja, Marca nueva) {
        int idx = marcas.indexOf(vieja);
        if (idx == -1) {
            return false;
        }
        marcas.set(idx, nueva);
        return true;
    }

    @Override
    public boolean eliminar(long id) {
        return marcas.removeIf(m -> m.getId() == id);
    }

    @Override
    public boolean listaVacia() {
        return marcas.isEmpty();
    }
}
