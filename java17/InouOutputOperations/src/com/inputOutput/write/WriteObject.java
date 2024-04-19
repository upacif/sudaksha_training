package com.inputOutput.write;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("C:\\PA\\sudaksha\\files\\card_details");
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				) {
			
			CardInfo cardInfo1=new CardInfo(123456789,10,26,567,"Sudaksha");
			CardInfo cardInfo2=new CardInfo(987654321,04,25,123,"Sudaksha");
			oos.writeObject(cardInfo1);
			oos.writeObject(cardInfo2);
			System.out.println("Created!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
