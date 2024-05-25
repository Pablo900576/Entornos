package entornos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import entornos.Operacion.OperacionDistanciaEuclidea;

public class DistanciaEuclideaTest {

    @ParameterizedTest
    @CsvSource({
        "1, 2, 3, 4, 5, 6, 5.196",
        "0, 0, 0, 0, 0, 0, 0.0",
        "-1, -2, -3, 1, 2, 3, 7.483",
        "5, 5, 5, 10, 10, 10, 8.660"
    })
    public void testDistanciaEuclidea(double x1, double y1, double z1, double x2, double y2, double z2, double resultadoEsperado) {
        Vector v1 = new Vector(x1, y1, z1);
        Vector v2 = new Vector(x2, y2, z2);
        OperacionDistanciaEuclidea operacionDistanciaEuclidea = new OperacionDistanciaEuclidea(v1, v2);
        assertEquals(resultadoEsperado, operacionDistanciaEuclidea.realizarOperacion(), 0.001);
    }
}
