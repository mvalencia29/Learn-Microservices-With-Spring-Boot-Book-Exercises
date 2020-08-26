package microservices.book.multiplication.domain;

public final class MultiplicationResultAttempt {
	
	private final User user;
	
	private final Multiplication multiplication;
	
	private final int resultAttempt;
	
	private final boolean correct;
	
	public MultiplicationResultAttempt(User user, Multiplication multiplication, int resultAttempt, boolean correct) {
		this.user = user;
		this.multiplication = multiplication;
		this.resultAttempt = resultAttempt;
		this.correct = correct;
	}
	
    MultiplicationResultAttempt() {
    	this(null, null, -1, false);
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
	
	public boolean getCorrect() {
		return correct;
	}
	
	@Override
	public String toString() {
		return user.toString() + ", the result of the multiplication : " + multiplication.toString() + ", was : " + resultAttempt;
	}


}
