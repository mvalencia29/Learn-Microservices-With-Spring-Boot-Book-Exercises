package microservices.book.multiplication.domain;

public final class MultiplicationResultAttempt {
	
	private final User user;
	
	private final Multiplication multiplication;
	
	private final int resultAttempt;
	
	public MultiplicationResultAttempt(User user, Multiplication multiplication, int resultAttempt) {
		this.user = user;
		this.multiplication = multiplication;
		this.resultAttempt = resultAttempt;
	}
	
	public User getUser() {
		return user;
	}
	
	public Multiplication getMultiplication() {
		return multiplication;
	}
	
	public int getResultAttempt() {
		return resultAttempt;
	}
	
	@Override
	public String toString() {
		return user.toString() + ", the result of the multiplication : " + multiplication.toString() + ", was : " + resultAttempt;
	}


}
