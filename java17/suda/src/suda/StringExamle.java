package suda;

import java.util.Scanner;
import java.util.stream.Stream;

public class StringExamle {
	public static void main(String[] args) {
		/*int question=6;
		String input;
		Scanner scanner=new Scanner(System.in);
		switch (question) {
		case 4:
		input=scanner.nextLine();
		for (int i = 0; i <= input.length(); i++) {
			System.out.println(input.substring(0,i));
		}
		break;
		case 5:
			input=scanner.nextLine();
			for (int i = 0; i <input.length(); i++) {
				System.out.println(input.charAt(i));
			}
			break;
			
		case 6:
			input=scanner.nextLine();
			String tmpString="";
			for (int i = 0; i < input.length(); i++) {
				if(tmpString.contains(""+input.charAt(i))) {
				System.out.println(input.charAt(i)+"Is duplicated");
				}else {
				tmpString=tmpString+input.charAt(i);
				}
			}
			
			break;
			
		case 7:
			input=scanner.nextLine();
			StringBuilder sb1 =new StringBuilder(input);
			sb1.reverse();
			String reversed = sb1.toString();
			
			System.out.println("Original: "+input);
			System.out.println("Reversed: "+reversed);
			if(input.equals(reversed)) {
				System.out.println("This String is Palindrome");
			}else {

				System.out.println("This String is not Palindrome");
			}
			
			break;
			
			default:
				System.out.println("Question not available");
			
		
	}*/
		
		String str1="Java is very simple language";
		String str2="";
		System.out.println("Blank="+str1.isBlank());
		System.out.println("Blank="+str2.isBlank());
		System.out.println("Empty="+str2.isEmpty());
		
		String city="hyderabad";
		System.out.println(city+" "+city.length());
		System.out.println(city.stripLeading());
		System.out.println(city+" "+city.length());
		System.out.println(city.stripTrailing());
		String state="   Karnataka   ";
		System.out.println(state);
		System.out.println(state.strip());
		
		String java="java\nis\nsimple\nprogramming\nlanguage";
		Stream<String> str=java.lines();
		str.forEach((s)->System.out.println(s));
	}

}
