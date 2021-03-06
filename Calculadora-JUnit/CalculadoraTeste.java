import static org.junit.Assert.*;

import org.junit.Test;


class CalculadoraTeste {
	
	Calculadora calc = new Calculadora(10,2);
	Calculadora calc2 = new Calculadora(1,0);

	@Test
	public void testAdicao_4() {
		assertEquals(12, 0, calc.getSoma());
	}
	
	@Test
	public void testSubtracao_4() {
		assertEquals(10, 0, calc.getSubtracao());
	}
	
	@Test
	public void testMultiplicacao_4() {
		assertEquals(21, 0, calc.getMultiplicacao());
	}
	
	@Test
	public void testDivisao_4() {
		assertEquals(5, 0, calc.getDivisao());
	}
	
	@Test
	public void testAdicao2_4() {
		assertEquals(8, 0, calc2.getSoma());
	}
	
	@Test(expected = ArithmeticException.class) 
	public void testDivisao2_4() {
		calc2.getDivisao();
	}
		
}
