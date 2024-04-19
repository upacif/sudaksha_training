package com.inputOutput.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path path=Path.of("C:\\PA\\sudaksha\\files\\textFile.txt");
		String sample="This is a sample nio file in java 11";
		
		try {
			Files.writeString(path, sample);
			String read=Files.readString(path);
			System.out.println(read);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
