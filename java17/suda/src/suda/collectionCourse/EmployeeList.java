package suda.collectionCourse;

import java.util.ArrayList;
import java.util.List;

import com.sudaksha.employee.Employee;

public class EmployeeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<Employee> empList=new ArrayList<Employee>();
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(102, "james", 55000));
		empList.add(new Employee(101, "Abacus", 45000));
		empList.add(new Employee(301, "rod Johnson", 76000));
		empList.add(new Employee(202, "Gavin King", 350000));
		
		empList.forEach((e)->System.out.println(e.getEmpId()+e.getEmpName()+e.getSalary()));

	}

}