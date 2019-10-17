package fr.fraction;

public final class Fraction {
	private int _denominateur;
	private int _numerateur;
	
	public  const Fraction ZERO = new Fraction(0,1);
	public  const Fraction UN = new Fraction(1,1);
	
	public Fraction(int numerateur, int denominateur) {
		
		this._numerateur= numerateur;
		this._denominateur = denominateur;
	}
	
	public Fraction(int numerateur, int denominateur) {
		
		this._numerateur= numerateur;
		this._denominateur = 1;
	}
	public Fraction(){
		this._numerateur = 0;
		this._denominateur =1;
	}
	public getNumerateur() {
		return _numerateur;
	}
	public getDenominateur() {
		return _denominateur;
	}
}

