package rectangulo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PrincipalTest {

    @Test
    public void testCalcularPerimetro() {
        Rectangulo rectangulo = new Rectangulo(5.0, 3.0);
        double perimetro = rectangulo.calcularPerimetro();
        assertEquals(16.0, perimetro, 0.001);
    }

    @Test
    public void testCalcularArea() {
        Rectangulo rectangulo = new Rectangulo(5.0, 3.0);
        double area = rectangulo.calcularArea();
        assertEquals(15.0, area, 0.001);
    }

    @ParameterizedTest
    @CsvSource({
        "5.0, 3.0, 16.0",
        "10.0, 5.0, 30.0",
        "0.0, 0.0, 0.0",
        "-5.0, 3.0, -4.0"
    })
    public void testCalcularPerimetroParametrizado(double largo, double ancho, double resultadoEsperado) {
        Rectangulo rectangulo = new Rectangulo(largo, ancho);
        double perimetro = rectangulo.calcularPerimetro();
        assertEquals(resultadoEsperado, perimetro, 0.001);
    }

    @ParameterizedTest
    @CsvSource({
        "5.0, 3.0, 15.0",
        "10.0, 5.0, 50.0",
        "0.0, 0.0, 0.0",
        "-5.0, 3.0, -15.0"
    })
    public void testCalcularAreaParametrizado(double largo, double ancho, double resultadoEsperado) {
        Rectangulo rectangulo = new Rectangulo(largo, ancho);
        double area = rectangulo.calcularArea();
        assertEquals(resultadoEsperado, area, 0.001);
    }
}
