package com.inputOutput.write;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("C:\\PA\\sudaksha\\files\\card_details");
				ObjectInputStream ois = new ObjectInputStream(fis);) {

			Object obj;
			while ((obj = ois.readObject()) != null) {
				CardInfo cardInfo = (CardInfo) obj;
				System.out.println(cardInfo);
			}
		} catch (IOException | ClassNotFoundException e) {

		}

	}

}
