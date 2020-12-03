package testjava8;

public class TestMethodBinding {

	public static void main(String[] args) {
		Parent p = new Child();
		
		p.compute(10);
		System.out.println(p.myText);
		
		
	/*	TestDefault t = new TestDefaultMethod();
		
		t.DefaultMethod();
		t.foo();*/

	}

}
