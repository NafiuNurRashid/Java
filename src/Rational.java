public class Rational {

	private int numerator = 0;
	private int denumerator = 1;

	public Rational(int numerator, int denumerator) {

		this.numerator = numerator;
		this.denumerator = denumerator;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenumerator() {
		return denumerator;
	}

	public void setDenumerator(int denumerator) {
		this.denumerator = denumerator;
	}

	public String toString() {
		return this.numerator + "/" + this.denumerator;
	}

	public Rational add(Rational r) {
		int a = this.numerator;
		int b = this.denumerator;
		int c = r.numerator;
		int d = r.denumerator;
		int newNumerator = a * d + b * c;
		int newDenumerator = b * d;
		Rational result = new Rational(newNumerator, newDenumerator);
		return result;

		// return new
		// Rational((this.numerator*r.denumerator)+(this.denumerator*r.numerator)+(this.denumerator*r.numerator));

		// return new Rational();

	}
	
	public Rational Subtract(Rational r) {
		int a = this.numerator;
		int b = this.denumerator;
		int c = r.numerator;
		int d = r.denumerator;
		int newNumerator = a * d - b * c;
		int newDenumerator = b * d;
		Rational result = new Rational(newNumerator, newDenumerator);
		return result;
	}
	
	public Rational Multiplication(Rational r) {
		int a = this.numerator;
		int b = this.denumerator;
		int c = r.numerator;
		int d = r.denumerator;
		int newNumerator = a * c;
		int newDenumerator = b * d;
		Rational result = new Rational(newNumerator, newDenumerator);
		return result;
	}
	
	
	public Rational Division(Rational r) {
		int a = this.numerator;
		int b = this.denumerator;
		int c = r.numerator;
		int d = r.denumerator;
		int newNumerator = a * d;
		int newDenumerator = b * c;
		Rational result = new Rational(newNumerator, newDenumerator);
		return result;
	}
	
	
	
	
	
	
	
	
	

}
