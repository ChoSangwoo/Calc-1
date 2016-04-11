package calculatorN;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void testAdd() {
		Calc calc = new Calc();
		calc.add(10, 20);
		assertEquals(30,calc.getResult());
	}

	@Test
	public void testsub() {
		Calc calc = new Calc();
		calc.sub(10, 20);
		assertEquals(-10,calc.getResult());
	}

	@Test
	public void testmul() {
		Calc calc = new Calc();
		calc.mul(10, 20);
		assertEquals(200,calc.getResult());
	}
	
	@Test
	public void testdiv() {
		Calc calc = new Calc();
		calc.div(20, 10);
		assertEquals(2,calc.getResult());
	}
	
	@Test	
	public void testinc() {
		Calc calc = new Calc();
		calc.inc(100);
		assertEquals(100,calc.getResult());
		calc.inc(200);
		assertEquals(300,calc.getResult());
	}
}