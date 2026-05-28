package ar.edu.unahur.obj2.marcas;

public class Reglamentaria {
    private static Reglamentaria instance;
    private Reglamentaria() {}
    private double reglamentacion;

    public static Reglamentaria getInstance() {
        if (instance == null) {
            instance = new Reglamentaria();
        }
        return instance;
    }

    public double getReglamentacion() {
        return reglamentacion;
    }
    public void setReglamentacion(double reglamentacion) {
        this.reglamentacion = reglamentacion;
    }

}
