package suda.collectionCourse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableListExample {

	public static void main(String[] args) {
		List<Integer> nums=new ArrayList<Integer>();
		nums.add(50);
		nums.add(20);
		nums.add(10);
		nums.add(60);
		nums.add(35);
		System.out.println("max: "+Collections.max(nums));
		System.out.println("min: "+Collections.min(nums));
		System.out.println("isempty: "+nums.isEmpty());
		nums.add(90);
		System.out.println(nums);
		List<String> fruits=List.of("apple","banana","mango","apple");
		System.out.println(fruits);
		Set<Integer> even=Set.of(20,30,10,40,50);
		System.out.println(even);
		Map<Integer, String> map=Map.of(1,"One",2,"two");
		System.out.println(map);
		map.put(3, "Three");
	}

}
