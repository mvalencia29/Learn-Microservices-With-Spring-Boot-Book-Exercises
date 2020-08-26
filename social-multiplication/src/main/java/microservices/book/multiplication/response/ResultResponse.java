package microservices.book.multiplication.response;

public class ResultResponse {

	private final boolean correct;

	public ResultResponse(final boolean correct) {
		this.correct = correct;
	}
	
	public boolean getCorrect() {
		return correct;
	}

}
