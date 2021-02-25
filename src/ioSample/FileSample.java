package ioSample;

import java.io.File;
import java.io.IOException;

public class FileSample {

	public static void main(String[] args) throws IOException {
		
		File file = new File("E:\\Vijay.txt");
		
		file.createNewFile();
		
		//System.out.println(file.exists());
	}
}
