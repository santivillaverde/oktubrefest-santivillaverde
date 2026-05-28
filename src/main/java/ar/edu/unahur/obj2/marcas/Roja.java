package ar.edu.unahur.obj2.marcas;

public class Roja extends Marca {
    public Roja(Double lupulo, String pais) {
        super(lupulo, pais);
    }

    @Override
    public Double gradualidad() {
        return Double.min(getLupulo() * 2,Reglamentaria.getInstance().getReglamentacion()) * 1.25;
    }

}
