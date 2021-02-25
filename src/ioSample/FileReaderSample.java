package ioSample;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderSample {

	public static void main(String[] args) throws IOException  {

		FileReader fileReader = new FileReader("E:\\Hari.txt");
		
		int data;
		
		while ((data=fileReader.read() )!=-1) {
			char c = (char)data;
			System.out.print(c);
		}
		
		
	}
}
