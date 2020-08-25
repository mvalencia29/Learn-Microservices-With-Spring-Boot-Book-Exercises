package microservices.book.multiplication.domain;

public class Multiplication {

	private final int factorA;

	private final int factorB;

	public Multiplication(int factorA, int factorB) {
		this.factorA = factorA;
		this.factorB = factorB;
	}

	public int getFactorA() {
		return factorA;
	}

	public int getFactorB() {
		return factorB;
	}
	
	@Override
	public String toString() {
		return "Multiplication : " + factorA + " X " + factorB;
	}

}
