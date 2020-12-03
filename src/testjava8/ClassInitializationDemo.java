package testjava8;


class Superclass{
	Superclass(){System.out.println(" Superclass : Constructor Called ");}
}

class Subclass extends Superclass{
	
	static final int STATIC_FINAL =47;
	static final int STATIC_FINAL2 =(int)(Math.random()*5);
	
	static {System.out.println("Subclass : static block initializer : ");}
	Subclass(){	System.out.println(" Subclass : Constructor Called ");}
}

public class ClassInitializationDemo {

	static {System.out.println("ClassInitializationDemo : static block initializer : ");}
	
	{System.out.println("ClassInitializationDemo : instance initializer block  ");}
	
	public static void main(String[] args) {
		System.out.println(" Subclass.STATIC_FINAL >>> "+Subclass.STATIC_FINAL);

		System.out.println(" Subclass.STATIC_FINAL2 >>> "+Subclass.STATIC_FINAL2);
		new Subclass();
	}

}
