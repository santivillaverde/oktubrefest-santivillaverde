package ar.edu.unahur.obj2.personas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.marcas.Jarra;
import ar.edu.unahur.obj2.marcas.Negra;
import ar.edu.unahur.obj2.marcas.Reglamentaria;
import ar.edu.unahur.obj2.marcas.Roja;
import ar.edu.unahur.obj2.marcas.Rubia;

public class PersonaTest {
    Belga martin = new Belga(75, false, 60);
    Roja roja = new Roja(5.0, "Argentina");
    Negra negra = new Negra(10.0, "Argentina");
    Rubia rubia = new Rubia(15.0, "Argentina", 5.0);
    Jarra jarraRubia = new Jarra(2.0, rubia, null);
    Reglamentaria reglamentaria = Reglamentaria.getInstance();

    @Test
    void totalDeAlcoholIngerido(){
        martin.beber(jarraRubia);
        assertEquals(2.5, martin.totalDeAlcohol());
    }

    @Test
    void personaNoEbria(){
        martin.beber(jarraRubia);
        assertFalse(martin.estaEbria());
    }
    @Test
    void leGustaRubia(){
        assertTrue(martin.leGustaMarca(rubia));
    }
}
