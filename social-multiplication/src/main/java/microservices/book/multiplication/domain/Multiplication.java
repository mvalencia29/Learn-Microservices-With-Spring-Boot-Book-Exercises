package microservices.book.multiplication.domain;

public final class Multiplication {

	private final int factorA;

	private final int factorB;

	public Multiplication(int factorA, int factorB) {
		this.factorA = factorA;
		this.factorB = factorB;
	}
	
	public Multiplication() {
		this(0, 0);
	}

	public int getFactorA() {
		return factorA;
	}

	public int getFactorB() {
		return factorB;
	}

	@Override
	public String toString() {
		return factorA + " X " + factorB;
	}

}
