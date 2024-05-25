package entornos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import entornos.Operacion.OperacionDistanciaEuclidea;
import entornos.Operacion.OperacionProductoEscalar;
import entornos.Operacion.OperacionSuma;

public class PrincipalTest {

    @Test
    public void testSumaVectores() {
        Vector v1 = new Vector(1, 2, 3);
        Vector v2 = new Vector(4, 5, 6);
        OperacionSuma operacionSuma = new OperacionSuma(v1, v2);
        Vector resultado = new Vector(
            v1.getX() + v2.getX(),
            v1.getY() + v2.getY(),
            v1.getZ() + v2.getZ()
        );
        assertEquals(resultado.modulo(), operacionSuma.realizarOperacion(), 0.001);
    }

    @Test
    public void testProductoEscalar() {
        Vector v1 = new Vector(1, 2, 3);
        Vector v2 = new Vector(4, 5, 6);
        OperacionProductoEscalar operacionProductoEscalar = new OperacionProductoEscalar(v1, v2);
        double resultado = v1.getX() * v2.getX() + v1.getY() * v2.getY() + v1.getZ() * v2.getZ();
        assertEquals(resultado, operacionProductoEscalar.realizarOperacion(), 0.001);
    }

    @Test
    public void testDistanciaEuclidea() {
        Vector v1 = new Vector(1, 2, 3);
        Vector v2 = new Vector(4, 5, 6);
        OperacionDistanciaEuclidea operacionDistanciaEuclidea = new OperacionDistanciaEuclidea(v1, v2);
        double resultado = Math.sqrt(Math.pow(v1.getX() - v2.getX(), 2) + Math.pow(v1.getY() - v2.getY(), 2) + Math.pow(v1.getZ() - v2.getZ(), 2));
        assertEquals(resultado, operacionDistanciaEuclidea.realizarOperacion(), 0.001);
    }
}
