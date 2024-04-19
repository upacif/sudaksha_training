package suda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Persons> listOfPersons=new ArrayList<Persons>();
		listOfPersons.add(new Persons(27,"abc"));
		listOfPersons.add(new Persons(26,"mno"));
		listOfPersons.add(new Persons(28,"pqr"));
		listOfPersons.add(new Persons(27,"xyz"));
		
		listOfPersons.forEach((person)->{
			System.out.println(person);
		});
		
		Consumer<Persons> consumer=(person)->{
			System.out.println(person.getName());
			System.out.println(person.getCode());
		};
		consumer.accept(new Persons(30,"Ramesh"));

	}

}
