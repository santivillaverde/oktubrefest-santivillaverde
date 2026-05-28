package ar.edu.unahur.obj2.carpas;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.marcas.Jarra;
import ar.edu.unahur.obj2.marcas.Marca;
import ar.edu.unahur.obj2.personas.Persona;

public class Carpa {
    private Integer limite;
    private boolean tieneMusicaTradicional;
    private Marca marcaAVender;
    private List<Persona> personasEnCarpa = new ArrayList<>();

    public Carpa(Integer limite, boolean tieneMusicaTradicional, Marca marcaAVender) {
        this.limite = limite;
        this.tieneMusicaTradicional = tieneMusicaTradicional;
        this.marcaAVender = marcaAVender;
    }

    public boolean dejaIngresar(Persona persona) {
        return cantidadDePersonas() < limite && !persona.estaEbria();
    }

    public void ingresar(Persona persona) {
        if (persona.puedeEntrar(this)) {
            personasEnCarpa.add(persona);
        }
        else {
            throw new RuntimeException("No se puede ingresar a la carpa");
        }
    }

    public void servirJarra(Persona persona, Double litros) {
        if (personasEnCarpa.contains(persona)) {
            persona.beber(new Jarra(litros, marcaAVender, this));
        }
        else {
            throw new RuntimeException("La persona no está en la carpa");
        }
    }

    public long ebriosEmpedernidos(){
        return personasEnCarpa.stream().filter(p -> p.esEbrioEmpedernido()).count();
    }

    public boolean esHomogenea(){
        return personasEnCarpa.stream().map(p -> p.getPais()).distinct().count() <= 1;
    }

    public Integer limiteDePersonas() {
        return limite;
    }

    public boolean tieneMusicaTradicional() {
        return tieneMusicaTradicional;
    }

    public Marca getMarcaAVender() {
        return marcaAVender;
    }

    public List<Persona> getPersonasEnCarpa() {
        return personasEnCarpa;
    }

    public Integer cantidadDePersonas() {
        return personasEnCarpa.size();
    }


    

}
