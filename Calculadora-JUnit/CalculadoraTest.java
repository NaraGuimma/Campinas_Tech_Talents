import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CalculadoraTest {
	
	Calculadora calc = new Calculadora(10,2);
	Calculadora calc2 = new Calculadora(1,0);

	@Test
	public void testAdicao() {
		assertEquals(12, 0, calc.getSoma());
	}
	
	@Test
	public void testSubtracao() {
		assertEquals(10, 0, calc.getSubtracao());
	}
	
	@Test
	public void testMultiplicacao() {
		assertEquals(21, 0, calc.getMultiplicacao());
	}
	
	@Test
	public void testDivisao() {
		assertEquals(5, 0, calc.getDivisao());
	}
	
	@Test
	public void testAdicao2() {
		assertEquals(8, 0, calc2.getSoma());
	}
	
	@Test
	public void testDivisao2() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> calc2.getDivisao());
		
	}
	
	
	
}
