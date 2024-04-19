package suda.collectionCourse;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class StreamAPIEx1 {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(102, "james", 55000));
		empList.add(new Employee(101, "Abacus", 45000));
		empList.add(new Employee(301, "rod Johnson", 76000));
		empList.add(new Employee(202, "Gavin King", 350000));
		empList.add(new Employee(201, "Arjun", 7500));
		empList.add(new Employee(302, "Sudaksh", 75000));
		List<Employee> salaryList=empList.stream()
				.filter((emp)->emp.getSalary()>50000)
				.map((emp)->emp)
				.collect(Collectors.toList());
		salaryList.forEach((emp)->
		System.out.println(emp)
		);
		

	}

}
