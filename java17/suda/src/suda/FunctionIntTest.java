package suda;

public interface FunctionIntTest {
	public int sum(int a,int b) ;
	 default String displayMessage() {
	return "The result is:";
	}

	 default void doneMethod() {
		System.out.println("Your done with this exercise..");
			}
}
