package testjava8;

public interface TestDefault {
	
	
	void foo();

	default void DefaultMethod() {
		
		System.out.println(" Interface TestDefault ");
	}
}
