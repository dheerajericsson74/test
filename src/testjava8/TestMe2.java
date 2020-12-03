package testjava8;

public class TestMe2 {

	
	static void print(String msg) {
		
		System.out.println(msg);
		msg += " ";
	}
	
	
	public static void main(String[] args) {
     
		
		String msg = "Hello";
		print(msg);
		
		msg+="World!";
		
		print(msg);
	
	}
		
		

}
