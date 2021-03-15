package exceptionhandling;

public class Test6 {
public static void main(String[] args) {
	try {
		int a[]=new int[5];
		a[10]=30/0;
	}
	catch(ArithmeticException e) {
		System.out.println("ArithemeticException");
}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("ArrayIndexOutBoundsException");
	}
	catch(Exception e) {
		System.out.println("Parent Exception occur");
	}
	System.out.println("rest of the code");
}
}
