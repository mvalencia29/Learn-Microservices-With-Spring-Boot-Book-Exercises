package microservices.book.multiplication.domain;

public final class User {
	
	private final String alias;
	
	public User(String alias) {
		this.alias = alias;
	}
	
	public String getAlias() {
		return alias;
	}
	
	@Override
	public String toString() {
		return "User : " + alias;  
	}

}
