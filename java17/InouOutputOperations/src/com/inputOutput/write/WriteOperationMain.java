package com.inputOutput.write;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteOperationMain {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream fous=new FileOutputStream("C:\\PA\\sudaksha\\files\\file.txt");
		int initial=65;
		while(initial<91){
			fous.write(initial);
			initial++;
		}
		System.out.println("Writing done..");
   fous.close();
	}

}
