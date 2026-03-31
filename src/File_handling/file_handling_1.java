package File_handling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class file_handling_1 {
	
	public static void main(String[] args) {
		
		try {
			
			//how to create file ?
			FileOutputStream fout = new FileOutputStream("test.txt");
			FileOutputStream fout1 = new FileOutputStream("test1.txt");
			
			String s = "This is Sample file 123";
			byte[] b = s.getBytes();
			fout.write(b);
			
			String s1 = "Another sample file";
			byte[] b1 = s1.getBytes();
			fout1.write(b1);
			
			fout.close();
			fout1.close();
			
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
