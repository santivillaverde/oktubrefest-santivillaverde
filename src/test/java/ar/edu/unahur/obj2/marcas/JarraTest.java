package ar.edu.unahur.obj2.marcas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JarraTest {
    Roja roja = new Roja(5.0, "Argentina");
    Negra negra = new Negra(10.0, "Argentina");
    Rubia rubia = new Rubia(10.0, "Argentina", 5.0);
    Jarra jarraRoja = new Jarra(0.5, roja, null);
    Reglamentaria reglamentaria = Reglamentaria.getInstance();


    @Test
    void contenidoDeAlcholDeJarraRoja() {
        reglamentaria.setReglamentacion(0.08);
        assertEquals(0.05, jarraRoja.alcoholTotal() );
    }
}
