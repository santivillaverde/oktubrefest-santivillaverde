package ar.edu.unahur.obj2.personas;

import ar.edu.unahur.obj2.carpas.Carpa;
import ar.edu.unahur.obj2.marcas.Marca;

public class Aleman extends Persona {
    public Aleman(Integer peso, boolean leGustaMusicaTradicional, Integer aguante) {
        super(peso, leGustaMusicaTradicional, aguante);
    }

    @Override
    public boolean leGustaMarca(Marca marca) {
        return Boolean.TRUE;
    }

    @Override
    public boolean quiereEntrar(Carpa carpa){
        return super.quiereEntrar(carpa) && carpa.cantidadDePersonas() % 2 == 0;
    }

}
