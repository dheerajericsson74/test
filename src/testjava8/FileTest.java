package testjava8;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		
		File f = new File("C:\\MyData\\sashakt-workspace\\testjava8\\src\\testjava8\\..\\..\\testmydir.txt");
		
	try {
		f.createNewFile();
		System.out.println(f.getPath());
        System.out.println(f.getAbsolutePath());    
        System.out.println(f.getCanonicalPath());
	} catch (Exception e) {
		// 
		e.printStackTrace();
	} 

	}

}
