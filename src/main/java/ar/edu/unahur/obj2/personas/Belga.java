package ar.edu.unahur.obj2.personas;

import ar.edu.unahur.obj2.marcas.Marca;

public class Belga extends Persona {

    public Belga(Integer peso, boolean leGustaMusicaTradicional, Integer aguante) {
        super(peso, leGustaMusicaTradicional, aguante);
    }

    @Override
    public boolean leGustaMarca(Marca marca) {
        return marca.getLupulo() > 4.0;
    }

}
