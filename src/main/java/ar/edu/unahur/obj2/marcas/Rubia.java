package ar.edu.unahur.obj2.marcas;

public class Rubia extends Marca {
    private final Double gradualidad;

    public Rubia(Double lupulo, String pais, Double gradualidad) {
        super(lupulo, pais);
        this.gradualidad = gradualidad;
    }

    @Override
    public Double gradualidad() {
        return gradualidad;
    }

}
