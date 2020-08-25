package microservices.book.multiplication.service;

import org.junit.Before;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import microservices.book.multiplication.domain.*;

import static org.mockito.BDDMockito.given;

import static org.assertj.core.api.Assertions.assertThat;

public class MultiplicationServiceImplTest {

	private MultiplicationServiceImpl multiplicationServiceImpl;

	@Mock
	private RandomGeneratorService randomGeneratorService;

	@Before
	public void setUp() {
		// With this call to initMocks we tell Mockito to process the annotations
		MockitoAnnotations.initMocks(this);
		multiplicationServiceImpl = new MultiplicationServiceImpl(randomGeneratorService);
	}

	@Test
	public void createRandomMultiplicationTest() {
		// given (our mocked Random Generator service will return first 50, then 30)

		given(randomGeneratorService.generateRandomFactor()).willReturn(50, 30);
		// when
		Multiplication multiplication = multiplicationServiceImpl.createRandomMultiplication();
		// assert
		assertThat(multiplication.getFactorA()).isEqualTo(50);
		assertThat(multiplication.getFactorB()).isEqualTo(30);
	}
	
	@Test
	public void checkCorrectAttemptTest() {
		Multiplication multiplication = new Multiplication(50, 60);
		User user = new User("john_doe");
		MultiplicationResultAttempt attempt = new MultiplicationResultAttempt(user, multiplication, 3000);
		
		boolean attemptResult = multiplicationServiceImpl.checkAttempt(attempt);
		
		assertThat(attemptResult).isTrue();
	}
	
	@Test
	public void checkWrongAttemptTest() {
		Multiplication multiplication = new Multiplication(50, 60);
		User user = new User("john_doe");
		MultiplicationResultAttempt attempt = new MultiplicationResultAttempt(user, multiplication, 3010);
		
		boolean attemptResult = multiplicationServiceImpl.checkAttempt(attempt);
		
		assertThat(attemptResult).isFalse();
	}

}
