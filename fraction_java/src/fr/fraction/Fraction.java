package fr.fraction;

public final class Fraction {
	private int _denominateur;
	private int _numerateur;

	public static  Fraction ZERO = new Fraction(0, 1);
	public static  Fraction UN = new Fraction(1, 1);

	public Fraction(int numerateur, int denominateur) {
		 if(denominateur == 0) {
	            throw new IllegalArgumentException("denominator is zero");
	        }
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
	
	public Fraction add(Fraction aFraction) { 
		  if(aFraction == ZERO) return this;
		  int num = (this._numerateur * aFraction._denominateur ) + (this._denominateur * aFraction._numerateur);
		  int den = (this._denominateur * aFraction._denominateur);
		  Fraction result = new Fraction(num, den);
	    return result;
	}
	

	@Override
	public String toString() {
		return this._numerateur + "/" + this._denominateur;

	}
	
	public long longValue() {
		return (long) this.virguleFlottante();
		
	}
	

	  public int compareTo(Fraction aFraction) {
		 long t = this.getNumerateur() * aFraction.getDenominateur();
		 long f = aFraction.getNumerateur() * this.getDenominateur();
		 
		 int result = 0;
		 
		 if(t>f) result = 1;
		 else if (t<f) result = -1;
		 return result;
		  
	  }
	
	  
	  @Override
		public int hashCode() {
			final int x = 17;
			int result = 1;
			result = x* result + (this._numerateur) / (this._denominateur);
			return result;
		}
	  
	// Function to reduce a fraction to its lowest form
	  static void reduceFraction(int x, int y)
	  {
	      int d;
	      d = __gcd(x, y);
	   
	      x = x / d;
	      y = y / d;
	   
	      System.out.println("x = " + x + ", y = " + y);
	  }
	   
	  static int __gcd(int a, int b)
	  {
	      if (b == 0)
	          return a;
	      return __gcd(b, a % b);
	       
	  }
	
}
