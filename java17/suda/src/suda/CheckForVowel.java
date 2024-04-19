package suda;

import java.util.Scanner;

public class CheckForVowel {
	
	public static void main(String[] args) {
		char character='e';
		switch (character) {
		case 'i': 
		case 'u': 
		case '0':
		case 'a':
		case 'e': 
		case 'I':
		case 'U':
		case 'O':
		case 'A': 
		case 'E': 
			System.out.println("It is a vowel");
			break;
			
		default:
			System.out.println("It is a consonate");
		}
		
		String input;
		Scanner scanner=new Scanner(System.in);
		input=scanner.nextLine();
		for (int i = 0; i < input.length(); i++) {
			System.out.println(input.subSequence(0, i));
		}
	}

}
