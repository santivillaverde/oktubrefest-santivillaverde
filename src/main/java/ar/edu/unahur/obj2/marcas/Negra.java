package ar.edu.unahur.obj2.marcas;

public class Negra extends Marca {

    public Negra(Double lupulo, String pais) {
        super(lupulo, pais);
    }

    @Override
    public Double gradualidad() {
        return Double.min(getLupulo() * 2,Reglamentaria.getInstance().getReglamentacion());
    }

}
