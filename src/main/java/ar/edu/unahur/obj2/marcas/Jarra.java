package ar.edu.unahur.obj2.marcas;

import ar.edu.unahur.obj2.carpas.Carpa;

public class Jarra {
    private Double litros;
    private Marca marca;
    private Carpa carpa;

    public Jarra(Double litros, Marca marca, Carpa carpa) {
        this.litros = litros;
        this.marca = marca;
        this.carpa = carpa;
    }
    public Double alcoholTotal() {
        return litros * marca.gradualidad();
    }

    public Carpa getCarpa() {
        return carpa;
    }

    public Double getLitros() {
        return litros;
    }
    public Marca getMarca() {
        return marca;
    }
}
