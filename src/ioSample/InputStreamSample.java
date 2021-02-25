package ioSample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
121import java.io.InputStream;

public class InputStreamSample {

	public static void main(String[] args) throws IOException {

		File file = new File("E:\\Vijay.txt");
		InputStream inputStream = new FileInputStream(file);

		int data;

		while ((data = inputStream.read()) != -1) {
			char c = (char) data;
			System.out.print(c);
		}
		inputStream.close();
	}
}
