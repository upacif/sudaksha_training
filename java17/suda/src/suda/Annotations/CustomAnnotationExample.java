package suda.Annotations;

import java.lang.reflect.Method;

public class CustomAnnotationExample {
	@SingleValuedAnnotation(value = 300)
	public void display() {
		System.out.println("sample method with custom annotation");
	}
	
public static void main(String[] args) throws NoSuchMethodException, SecurityException {
	CustomAnnotationExample  h=new CustomAnnotationExample();
	Method m =h.getClass().getMethod("display");
	SingleValuedAnnotation an2=m.getAnnotation(SingleValuedAnnotation.class);
	System.out.println("Value="+an2.value());
}

}
