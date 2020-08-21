package microservices.book.multiplication.service;

import microservices.book.multiplication.domain.Multiplication;

public interface IMultiplicationService {
	
	Multiplication createRandomMultiplication();
	
}
