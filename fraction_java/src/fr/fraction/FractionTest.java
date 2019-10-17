package fr.fraction;

import org.junit.Test;

public class FractionTest {

	@Test
	public void testConstructeur1() {
		Fraction f1 = new Fraction(1,2);
		Fraction f2 = new Fraction(3);
		assert(f1.virguleFlottante()>0.2);
		System.out.println(f1.virguleFlottante());
		
		assert(f2.virguleFlottante()>f1.virguleFlottante());
		System.out.println(f2.virguleFlottante());
		System.out.println("f1 = "+ f1.toString() + " != " + " f2= " + f2.toString());
	}

}
