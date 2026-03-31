package File_handling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class file_handling_3 {
public static void main(String[] args) throws IOException {
	
	FileInputStream fin = new FileInputStream("test.txt");
	FileInputStream fin1 = new FileInputStream("test1.txt");
	
	SequenceInputStream seq = new SequenceInputStream(fin, fin1);
	
	int i=0;
	while( (i=seq.read()) != 0 ) {
		System.out.print((char)i);
	}
	
	fin.close();
	fin1.close();
	seq.close();
}
}
