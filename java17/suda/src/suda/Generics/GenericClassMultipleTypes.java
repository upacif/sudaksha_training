package suda.Generics;

public class GenericClassMultipleTypes {
	
	public static void main(String[] args) {
		Book<Integer, String> bk=new Book<>();
		bk.add(101, "Java programming");
		System.out.println(bk.getFirst()+" "+bk.getSecond());
		Book<Double, Double> bkd=new Book<Double, Double>();
		bkd.add(100.5,200.5);
		System.out.println(bkd.getFirst()+" "+bkd.getSecond());
		
	}

}
