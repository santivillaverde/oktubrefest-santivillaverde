package ar.edu.unahur.obj2.personas;

import ar.edu.unahur.obj2.marcas.Marca;

public class Checo extends Persona {

    public Checo(Integer peso, boolean leGustaMusicaTradicional, Integer aguante) {
        super(peso, leGustaMusicaTradicional, aguante);
    }

    @Override
    public boolean leGustaMarca(Marca marca) {
        return marca.gradualidad() > 8.0;
    }

}
