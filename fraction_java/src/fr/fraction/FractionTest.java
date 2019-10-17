package fr.fraction;

import org.junit.Test;

public class FractionTest {

	@Test
	public void test() {
		Fraction f = new Fraction(1,2);
		assert(f.virguleFlottante()>0.2);
		System.out.println(f.virguleFlottante());
		
	}

}
