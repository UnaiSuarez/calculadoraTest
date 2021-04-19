import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {
    @Test
    public void Suma(){
        Calculadora c = new Calculadora();
        int resultado = c.sumar(1,3);
        int resultadoEsperado = 4;
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void Restar(){
        Calculadora c = new Calculadora();
        int resultado = c.restar(3,1);
        int resultadoEsperado = 2;
        assertEquals(resultadoEsperado, resultado);
    }
    @Test
    public void Multiplicar(){
        Calculadora c = new Calculadora();
        int resultado = c.multimplicar(2,2);
        int resultadoEsperado = 4;
        assertEquals(resultadoEsperado, resultado);
    }
    @Test
    public void Dividir(){
        Calculadora c = new Calculadora();
        int resultado = c.dividir(8,2);
        int resultadoEsperado = 4;
        assertEquals(resultadoEsperado, resultado);
    }
}
