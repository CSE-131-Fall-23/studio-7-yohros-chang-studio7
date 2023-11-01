package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	private String name;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		name = numerator + " / " + denominator;
	}
	
	public String getName() {
		return name;
	}
	
	public static Fraction add(Fraction a, Fraction b) {
		if (a.denominator == b.denominator) {
			int newNumerator = a.numerator + b.numerator;
			return new Fraction(newNumerator, a.denominator);
		} else {
			int newDenominator = a.denominator * b.denominator;
			int newNumerator = a.numerator * b.denominator + b.numerator * a.denominator;
			return new Fraction(newNumerator, newDenominator);
		}
	}
	
	public static Fraction multiply(Fraction a, Fraction b) {
		return new Fraction(a.numerator * b.numerator, b.denominator * b.denominator);
	}
	
	public Fraction reciprocal() {
		return new Fraction(denominator, numerator);
	}
	
	public static int gcd(int p, int q) {
		if (p % q == 0) {
			return q;
		} else {
			return gcd(q, p % q);
		}
	}
	
	public Fraction simplify() {
		int gcd = gcd(numerator, denominator);
		if (gcd == 1) {
			return this;
		} else {
			return new Fraction(numerator / gcd, denominator / gcd);
		}
	}
	
	public static void main(String args[]) {
		Fraction a = new Fraction(1, 2);
		Fraction b = new Fraction(5, 2);
		Fraction c = new Fraction(1, 4);
		Fraction d = new Fraction(12, 8);
		
		System.out.println(d.simplify().getName());
		
		Fraction potato = add(a, b);
		System.out.println(potato.simplify().getName());
		
		Fraction tomato = multiply(b, c);
		System.out.println(tomato.simplify().reciprocal().getName());
	}
}
