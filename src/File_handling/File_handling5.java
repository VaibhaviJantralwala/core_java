package File_handling;

import java.io.File;
import java.io.IOException;

public class File_handling5 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("Demo.txt");
		f.createNewFile();
		
		System.out.println(f.getAbsolutePath());
		System.out.println(f.exists());
		
	}
}
