package fr.fraction;

public final class Fraction {
	private int _denominateur;
	private int _numerateur;

	public static  Fraction ZERO = new Fraction(0, 1);
	public static  Fraction UN = new Fraction(1, 1);

	public Fraction(int numerateur, int denominateur) {
		this._denominateur = denominateur;
		this._numerateur = numerateur;

	}

	public Fraction(int numerateur) {
		this._denominateur = 1;
		this._numerateur = numerateur;

	}

	public Fraction() {
		this._denominateur = 1;
		this._numerateur = 0;

	}

	public int getNumerateur() {

		return _numerateur;

	}

	public int getDenominateur() {
		return _denominateur;
	}

	public double virguleFlottante() {
		return ((double) this._numerateur) / ((double) this._denominateur);
	}

	@Override
	public String toString() {
		return this._numerateur + "/" + this._denominateur;

	}

	
}
