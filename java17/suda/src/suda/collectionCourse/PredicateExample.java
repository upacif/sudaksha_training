package suda.collectionCourse;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		ArrayList<Employee> empls=new ArrayList<Employee>();
		empls.add(new Employee(101,"Medplus",4000));
		empls.add(new Employee(501,"James gosling",8000));
		empls.add(new Employee(303,"Rod Johnson",9000));
		Predicate<Employee> slaPredicate=(empl)->empl.getSalary()>5000;
		Predicate<Employee> codePredicate=(empl)->empl.getEmpId()==501;
		System.out.println("Predicate example");
		for(Employee e: empls) {
			if (codePredicate.test(e)) {
				System.out.println(e);
			}
		}

	}

}
