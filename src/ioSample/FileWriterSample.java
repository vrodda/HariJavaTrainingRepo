package ioSample;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterSample {

	public static void main(String[] args) throws IOException {

		FileWriter fileWriter = new FileWriter("E:\\Hari.txt");
		fileWriter.write("How are you");
		fileWriter.close();
	}
}
