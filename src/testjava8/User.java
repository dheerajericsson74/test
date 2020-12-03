package testjava8;

public class User {

	
	public int id =1;
	public String userType ="USER";
	
	public void displayUserInfo() {
		
		System.out.println("\n Displaying User Info");
		System.out.println("[ID] :"+id);
		System.out.println("[userType] :"+userType);
	}
	
	
	public void printUserType() {
		
		System.out.println("[printUserType] :"+userType);
		
	}
	
}
