package com.java17Features.records;

import java.util.ArrayList;
import java.util.List;

public class RecordMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std=new Student(101, "James gosling", 500);
		System.out.println(std.id()+" "+std.name()+" "+std.marks());
		
		System.out.println(Student.group);
		
		List<Student> stdList=new ArrayList<Student>();
		stdList.add(new Student(20, "aaaaaa", 500));
		stdList.add(new Student(30, "aaabbb", 600));
		stdList.add(new Student(25, "ccc", 550));
		stdList.add(new Student(35, "ddd", 700));
		
		stdList.forEach((s)->System.out.println(s.id()+s.name()+s.marks()));

	}

}
