package fr.fraction;
import static org.junit.Assert.*;

import org.junit.*;

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
		
		assert(threeFifths.virguleFlottante()>f1.virguleFlottante());
		assert(twoFourths.virguleFlottante()>=f1.virguleFlottante());
		assert(threeSixths.virguleFlottante()>=f3.virguleFlottante());
		
		
	}
	
	private static Fraction f1, f2, f3, f4;
	private static Fraction threeFifths;
	private static Fraction oneHalf, twoFourths, threeSixths;

    /**
     * This method runs before each test and allows us to
     * create a couple of standard objects for the tests.
     */
	@BeforeClass public static void beforeEverything() {
		f1 = new Fraction(1,2);
		f2 = new Fraction(1,2);
		f3 = new Fraction(1,2);
		f4 = new Fraction(3,7);

		threeFifths = new Fraction(3,5);
		oneHalf = new Fraction(1,2);
		twoFourths = new Fraction(2,4);
		threeSixths = new Fraction(3,6);
	}

    /**
     * This method runs after each test and allows us to
     * clear out the test environment and dispose of our
     * standard test objects.
     */
	@AfterClass public static void afterEverything() {
		f1 = null;
		f2 = null;
		f3 = null;
		f4 = null;
		
		threeFifths = null;
		oneHalf = null;
		twoFourths = null;
		threeSixths = null;
	}

	/**
	 * Ensure that we can build a few fractions, using
	 * known valid values.
	 * <p>
	 * None of these should throw exceptions, so if they do, JUnit will
	 * catch them and alert us to the fact that we have a problem.
	 * <p>
	 * I'm using a language feature of Java where you don't have to
	 * use the return value from a method. In this instance, I only want
	 * to create a fraction and be sure that it didn't throw an exception.
	 */
	@Test public void testConstructorWithGoodValues() {
		new Fraction(1, 3);
		new Fraction(3, 2);
		new Fraction(1, 1);
	}

	/**
	 * Fractions may not have a zero denominator.
	 * <p>
	 * In this case I expect to see an exception, specifically an
	 * {@code IllegalArgumentException} thrown when attempting to
	 * create a fraction with a zero value denominator.
	 * <p>
	 * Think of it as not failing is failing, for this test.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testConstructorWithZeroDenominator() {
		new Fraction(1, 0);
	}

	/**
	 * Test the accessors of the object.
	 * <p>
	 * As this is an immutable object, there are no setter methods, but
	 * we are still wise to test the getters. I used to test them all
	 * individually, but these days I test all the accessors in a single
	 * method to emphasize their similar purpose.
	 */
	@Test public void testAccessors() {
		assertEquals(1, f1.getNumerateur());
		assertEquals(2, f1.getDenominateur());
	}

	/**
	 * Test that reduced fractions are equal.
	 * <p>
	 * This is where meaningful variable names help to make the tests
	 * more clear. Here we are testing that one half is equal to two
	 * fourths reduced. As we don't write tests for tests, the best way
	 * to make our tests correct is to keep them short and easy to read.
	 */
	@Test public void testReduce() {
		assertEquals(oneHalf, 2/4);
		assertEquals(oneHalf, 3/6);
	}


    /**
     * Test that the {@code equals()} method handles nulls correctly.
     * <p>
     * An object is never equal to null.
     */
    @Test public void testNullBehaviorOfEquals() {
    	assertFalse(f1.equals(null));
    }

    /**
     * Test that the {@code equals()} method is reflexive.
     * <p>
     * An object is always equal to itself.
     */
    @Test public void testReflexiveBehaviorOfEquals() {
    	assertEquals(f1, f1);
    	assertTrue(f1.equals(f1));
    }

    /**
     * Test that the {@code equals()} method handles unequal values correctly.
     * <p>
     * If o1 does not equal o2, then o2 must not equal o1.
     */
    @Test public void testUnequalValuesOfEqual() {
    	assertFalse(f1.equals(f4));
    	assertFalse(f4.equals(f1));
    }

    /**
     * Test that the {@code equals()} method is symmetrical.
     * <p>
     * If o1 is equal to o2, then o2 must be equal to o1.
     */
    @Test public void testSymmetricalBehaviorOfEquals() {
    	f1 = new Fraction(1,2);
		f2 = new Fraction(1,2);
		
    	assertTrue(f1.equals(f2));
    	assertTrue(f2.equals(f1));
    }


    /**cy
     * Test that hashcodes are equal for equal objects.
     * <p>
     * Objects that are equal, must have equal hashcodes.
     * Interestingly, there is no requirement for unequal
     * objects to have different hashcodes.
     * <p>
     * A classic cheat for hashcodes is to always return
     * an integer literal, such as 1. This is legal, but
     * causes very inefficient hashing behavior in most
     * collection objects.
     */
    @Test public void testEqualObjectsHaveEqualHashCodes() {
    	assertEquals(f1.hashCode(), f2.hashCode());
    }

    /**
     * Test that an object has a constant hashcode.
     * <p>
     * An unchanged object should always have the same hashcode within
     * any lifetime within an instance of the JVM.
     * <p>
     * The default behavior for the {@code hashCode()} method is to return
     * the memory address of the object instance. Obviously this can change
     * between runs of a program, but would be a constant through the
     * duration of each run.
     */
    @Test public void testSameObjectAlwaysSameHashCode() {
    	int h1 = f1.hashCode();
    	int h2 = f1.hashCode();
    	assertEquals(h1, h2);
    }

}
