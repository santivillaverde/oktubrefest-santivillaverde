package ar.edu.unahur.obj2.marcas;

public abstract class Marca {
    private Double lupulo;
    private String pais;

    public Marca(Double lupulo, String pais) {
        this.lupulo = lupulo;
        this.pais = pais;
    }

    public abstract Double gradualidad();

    public Double getLupulo() {
        return lupulo;
    }

    public String getPais() {
        return pais;
    }


}
