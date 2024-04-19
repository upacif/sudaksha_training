package com.inputOutput.write;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fis=new FileInputStream("C:\\PA\\sudaksha\\files\\file.txt");
			int r=0;
			while((r=fis.read())!=-1) {
				System.out.println((char)r);
			}
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
