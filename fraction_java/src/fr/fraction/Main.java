package fr.fraction;

public class Main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Fraction f = new Fraction(1, 2);
		Fraction e = new Fraction(4, 3);
		
		System.out.println(f.add(e).toString());
		
		System.out.println(f.virguleFlottante());
		System.out.println(f.toString());
	}

}
