package fr.fraction;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Fraction f = new Fraction(11, 2);
		Fraction e = new Fraction(4, 3);
		
		System.out.println("Addition 2 fractions : "+ "("+f.toString()+ ")+(" + e.toString()+ ")=(" + f.add(e).toString()+")");
		
		System.out.println("Virgule flottante : " + f.virguleFlottante());
		
		System.out.println("To string : " + f.toString());
		
		System.out.println("Hashcode : " + f.hashCode());
		
		@SuppressWarnings("resource")
		Scanner myinput = new Scanner(System.in);
		System.out.println("Specifer ton numérateur : ");
		int num = myinput.nextInt();
		System.out.println("Specifer ton dénominateur : ");
		int denom = myinput.nextInt();
		
		Fraction create_f = new Fraction(num, denom);
		System.out.println("Voici les résultats : ");
		
		System.out.println("Virgule flottante : " + create_f.virguleFlottante());
		
		System.out.println("To string : " + create_f.toString());
		 
		System.out.println("Hashcode : " + create_f.hashCode());
		
		
		
	}

}
