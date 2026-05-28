package ar.edu.unahur.obj2.personas;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.carpas.Carpa;
import ar.edu.unahur.obj2.marcas.Jarra;
import ar.edu.unahur.obj2.marcas.Marca;

public abstract class Persona {
    private Integer peso;
    private List<Jarra> jarras = new ArrayList<Jarra>();
    private boolean leGustaMusicaTradicional;
    private Integer aguante;
    private String pais;

    public Persona(Integer peso, boolean leGustaMusicaTradicional, Integer aguante) {
        this.peso = peso;
        this.leGustaMusicaTradicional = leGustaMusicaTradicional;
        this.aguante = aguante;
    }

    public boolean estaEbria() {
        Double totalLitros = jarras.stream().mapToDouble(Jarra::getLitros).sum();
        return totalLitros * peso > aguante;
    }

    public Double totalDeAlcohol(){
        return jarras.stream().mapToDouble(Jarra::alcoholTotal).sum();
    }

    public boolean quiereEntrar(Carpa carpa){
        return this.leGustaMarca(carpa.getMarcaAVender()) && leGustaMusicaTradicional == carpa.tieneMusicaTradicional(); 
    }

    public boolean puedeEntrar(Carpa carpa){
        return carpa.dejaIngresar(this) && quiereEntrar(carpa);
    }

    public boolean esEbrioEmpedernido(){
        return jarras.stream().allMatch(j -> j.getLitros() >= 1);
    }

    public boolean esPatriota(){
        return jarras.stream().allMatch(j -> j.getMarca().getPais().equalsIgnoreCase(pais));
    }

    public List<Carpa> carpasQueSirvieronJarras(){
        return jarras.stream().map(Jarra::getCarpa).toList();
    }

    public abstract boolean leGustaMarca(Marca marca);

    public void beber(Jarra jarra){
        jarras.add(jarra);
    }

    public long coincidenciaDeMarcas(Persona otraPersona){
        return jarras.stream().filter(j -> otraPersona.jarras.stream().anyMatch(oj -> oj.getMarca().equals(j.getMarca()))).count();
    }
    public long cuantosNoCoincidenEnMarcas(Persona otraPersona){
        return jarras.stream().filter(j -> otraPersona.jarras.stream().noneMatch(oj -> oj.getMarca().equals(j.getMarca()))).count();
    }

    public boolean sonComptabiles(Persona otraPersona){
        return this.coincidenciaDeMarcas(otraPersona) > this.cuantosNoCoincidenEnMarcas(otraPersona);
    }



    // Getters y setters
    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public List<Jarra> getJarras() {
        return jarras;
    }

    public boolean isLeGustaMusicaTradicional() {
        return leGustaMusicaTradicional;
    }

    public void setLeGustaMusicaTradicional(boolean leGustaMusicaTradicional) {
        this.leGustaMusicaTradicional = leGustaMusicaTradicional;
    }

    public Integer getAguante() {
        return aguante;
    }

    public void setAguante(Integer aguante) {
        this.aguante = aguante;
    }
    public String getPais() {
        return pais;
    }

}
