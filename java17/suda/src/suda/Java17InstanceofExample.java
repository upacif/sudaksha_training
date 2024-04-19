package suda;

import java.util.ArrayList;
import java.util.List;

public class Java17InstanceofExample {

	public static void main(String[] args) {
		List<Object> list=new ArrayList<Object>();
		list.add(123);
		list.add("java");
		list.add("spring");
		list.add(56.55);
		list.add('k');
		list.add(560);
		System.out.println(list);
		for(Object object:list) {
			if(object instanceof String str)
				System.out.println(str.toUpperCase());
		}

	}

}
