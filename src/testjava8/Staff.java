package testjava8;

public class Staff extends User {
	
	public int id =2;
	
	public void printId() {
		
		System.out.println("Id :"+id);
		System.out.println("super.id :"+super.id);
		
	}
	
	public Staff() {
		userType ="Staff";
	}

	
	public void printUserType() {
		
		System.out.println("[printUserType] : STAFF");
		
	}
}
