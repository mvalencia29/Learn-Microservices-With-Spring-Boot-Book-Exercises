package microservices.book.multiplication.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import microservices.book.multiplication.domain.Multiplication;
import microservices.book.multiplication.domain.MultiplicationResultAttempt;

@Service
public class MultiplicationServiceImpl implements MultiplicationService {

	private RandomGeneratorService randomGeneratorService;

	@Autowired
	public MultiplicationServiceImpl(RandomGeneratorService randomGeneratorService) {
		this.randomGeneratorService = randomGeneratorService;
	}

	@Override
	public Multiplication createRandomMultiplication() {
		int factorA = randomGeneratorService.generateRandomFactor();
		int factorB = randomGeneratorService.generateRandomFactor();
		return new Multiplication(factorA, factorB);
	}

	@Override
	public boolean checkAttempt(MultiplicationResultAttempt multiplicationResultAttempt) {
		boolean correct = multiplicationResultAttempt.getResultAttempt() == multiplicationResultAttempt
				.getMultiplication().getFactorA() * multiplicationResultAttempt.getMultiplication().getFactorB();

		Assert.isTrue(!multiplicationResultAttempt.isCorrect(), "You can't send an attempt marked as correct!!");

		MultiplicationResultAttempt checkedAttempt = new MultiplicationResultAttempt(
				multiplicationResultAttempt.getUser(), multiplicationResultAttempt.getMultiplication(),
				multiplicationResultAttempt.getResultAttempt(), correct);

		return correct;
	}

}
