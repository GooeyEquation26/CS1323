import java.text.DecimalFormat;

public class Triangle {

	//side length class variables
	private double sideA;
	private double sideB;
	private double sideC;

	//decimal formatter for the side lengths
	private static final DecimalFormat FORMATER = new DecimalFormat("#.###");
	
	//defines the initial object values, if the values are not valid, defaults to 1, 1, 1
	public Triangle(double sideA, double sideB, double sideC) {
		if(isTriangle(sideA, sideB, sideC)) {
			this.sideA = sideA;
			this.sideB = sideB;
			this.sideC = sideC;
		}else {
			this.sideA = 1;
			this.sideB = 1;
			this.sideC = 1;
		}
	}

	//Accessor for side A
	public double getSideA() {
		return this.sideA;
	}

	//Accessor for side B
	public double getSideB() {
		return this.sideB;
	}

	//Accessor for side C
	public double getSideC() {
		return this.sideC;
	}

	//mutator for side A, tests whether the new value is legal
	public boolean setSideA(double sideA) {

		if(isTriangle(sideA, sideB, sideC)) {
			this.sideA = sideA;
			return true;
		}
		return false;
	}

	//mutator for side B, tests whether the new value is legal
	public boolean setSideB(double sideB) {

		if(isTriangle(sideA, sideB, sideC)) {
			this.sideB = sideB;
			return true;
		}
		return false;
	}
	
	//mutator for side C, tests whether the new value is legal
	public boolean setSideC(double sideC) {

		if(isTriangle(sideA, sideB, sideC)) {
			this.sideC = sideC;
			return true;
		}
		return false;
	}
	
	//tests whether the values are true in three cases: 
	//1: positive values
	//2: triangle inequality
	//3: zero-area case
	private static boolean isTriangle(double a, double b, double c) {
		if((a < (b + c) && b < (a + c) && c < (a + b) && ((a > 0) && (b > 0) && (c > 0)))) {
			return true;
		}else if(((a > 0) && (b > 0) && (c > 0)) && (a == b) && (b == c)) {
			return true;
		}
		return false;
	}
	
	//default toString()
	public String toString() {
		return "Triangle(" + FORMATER.format(getSideA()) + ", " + FORMATER.format(getSideB()) + 
				 ", " + FORMATER.format(getSideC()) + ")";
				
	}
}
