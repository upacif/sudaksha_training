package suda;

public class FunctionIntCall {
	
	public static void main(String[] args) {
		
		FunctionIntTest fint=(a,b)->{
		return a+b;
		};
		int r =fint.sum(7,5);
		
		System.out.println(fint.displayMessage()+r);
		fint.doneMethod();
	}

}
